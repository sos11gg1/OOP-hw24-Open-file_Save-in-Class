package com.example.lib;

public class StudentGrade {
    private String a,a1,a2,a3,a4,a5,a6;
    private String Name[]={a,a1,a2,a3,a4,a5,a6};
    private String Calculus[]={a,a1,a2,a3,a4,a5,a6};
    private String IntroductionToComputer[]={a,a1,a2,a3,a4,a5,a6};
    private String Programming[]={a,a1,a2,a3,a4,a5,a6};
    private String StudentData;
    private String Grade;
    private int PeopleNumber;

    public void setName(int i,String name){
        Name[i] = name;
    }
    public void setCalculus(int i,String calculus){
        Calculus[i] = calculus;
    }
    public void setIntroductionToComputer(int i,String introductionToComputer){
        IntroductionToComputer[i] = introductionToComputer;
    }
    public void setProgramming(int i,String programming){
        Programming[i] = programming;
    }
    public void getStudentData(int i,String studemtdata){
        StudentData = studemtdata;
        int Fdot = StudentData.indexOf(",");
        Name[i] = StudentData.substring(0,Fdot);
        Grade = StudentData.substring(Fdot+1);
        int FgradeD = Grade.indexOf(",");
        int EgradeD = Grade.lastIndexOf(",");
        Calculus[i] = Grade.substring(0,FgradeD);//讀取微積分資料
        IntroductionToComputer[i] = Grade.substring((FgradeD+1),EgradeD);//讀取計算機概論
        Programming[i] = Grade.substring(EgradeD+1);
        PeopleNumber++;

    }
    public void PrintAllData(){
        for(int i=0;i<PeopleNumber;i++){
        System.out.printf("姓名:%s 微積分:%s分 計算機概論:%s分 程式設計:%s分\n",Name[i],Calculus[i],IntroductionToComputer[i],Programming[i]);
        }
    }
}
