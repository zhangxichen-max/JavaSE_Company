package com.heima.ClassTest;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "zhangxichen", 23);
        Student stu2 = new Student(2, "lisi",35);
        Student stu3 = new Student(3, "wangwu", 24);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //1. 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student(4, "zhaoliu", 26);

        //在添加学生对象时需要进行唯一性判断
        //1. 如果id在数组中存在，就不需要添加；若不存在则进行添加
        boolean flag = isFalse(arr, stu4.getId());
        if(flag){
            System.out.println("Id已存在, 请在修改完毕后进行添加");
        }else{
            //1、判断数组是否满了，如果满了则重新创建一个数组，如果未满，则直接进行添加即可
            int index = getCount(arr);
            int deleteIndex = findID(arr, 3);
            //int AddAgeIndex = findID(arr, 4);
            if(index== arr.length){
                //表示函数满了
                Student[] newArr = createArr(arr);
                newArr[index] = stu4;
                if(deleteIndex>=0){
                    newArr[deleteIndex] = null;
                }else{
                    System.out.println("当前ID不存在，删除失败");
                }

               int AddAgeIndex = findID(newArr, 4);
                System.out.println(AddAgeIndex);
              newArr[AddAgeIndex].setAge(newArr[AddAgeIndex].getAge()+1);
                printArr(newArr);
            }else{
                //表示函数未满
                arr[index] = stu4;
                if(deleteIndex>=0){
                    arr[deleteIndex] = null;
                }else{
                    System.out.println("当前ID不存在，删除失败");
                }
                int AddAgeIndex = findID(arr, 4);
                arr[AddAgeIndex].setAge(arr[AddAgeIndex].getAge()+1);
                printArr(arr);
            }
        }

    }

    public static boolean isFalse(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            //判断数组中存在这个对象
            if(arr[i] != null){
                  if(arr[i].getId()==id){
                      return true;
                  }
            }
        }
        return false;
    }

    //判断数组中是否由null的元素，如果有则表示没满
    public static int getCount(Student[] arr){
        //如果没满，则直接返回最近的那个索引
        //如果数组满了，则返回-1
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    //创建一个新数组，其长度增加1
    public static Student[] createArr(Student[] arr){
        int newLength = arr.length + 1;
        Student[] student = new Student[newLength];
        for (int i = 0; i < arr.length; i++) {
            student[i] = arr[i];
        }
        return student;
    }

    //把所有的数据展示出来
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                System.out.println(arr[i].getId() + ", " + arr[i].getName() + ", " + arr[i].getAge());
            }
        }
    }

    //通过id删除别人的名字：如果id不存在，则进行提示；若存在，则直接将对象置为null即可
    public static int findID(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                 if(arr[i].getId() == id){
                     return i;
                 }
            }
        }
        return -1;
    }

}
