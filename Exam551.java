package exam;

import java.util.ArrayList;

public class Exam551 {
	public static void main(String[] args) {
		 String[] ids = { "101", "112", "103", "145", "024", "095", "105", "100", "037", "122" };
		 String[] names = { "山田", "伊藤", "小林", "田中", "林", "鈴木", "佐藤", "岡田", "斉藤", "高橋" };
		 int[] ages = { 26, 22, 32, 25, 34, 27, 38, 31, 32, 25 };
		 int[] gendertypes = { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 };
		 boolean[] marriedflgs = { false, false, false, false, true, true, false, true, true, false };
		 
		 ArrayList<Integer>marriedThirtiesIndexes=new ArrayList<Integer>();
		 
		 ArrayList<Integer>marriedThirtiesFemaleIndexes=new ArrayList<Integer>();
		 
		 ArrayList<Integer>singleMaleIndexes=new ArrayList<Integer>();
		 
		 ArrayList<Integer>others=new ArrayList<Integer>();
		 
		 for(int i=0;i<10;i++) {
			 int age=ages[i];
			 boolean isFemale=gendertypes[i]==1;
			 boolean married=marriedflgs[i];
			 if (30<=age && age<40 && married) {
				 marriedThirtiesIndexes.add(i);
				 if(isFemale)marriedThirtiesFemaleIndexes.add(i);
				 }
			 if(married && !isFemale) {
				 singleMaleIndexes.add(i);
			}else {
				others.add(i);
			}
		 }
		 System.out.println("30代で結婚している人");
		 for(int i:marriedThirtiesIndexes) {
			 String id=ids[i];
			 String name=names[i];
			 int age=ages[i];
			 String gender=gendertypes[i]==0?"男":"女";
			 String mry=marriedflgs[i]?"既婚":"独身";
			 String message=String.format("{%s]%s 年齢:%s 性別:%s　結婚:%s",id,name,age,gender,mry);
			 System.out.println(message);
			 }
		 System.out.println("30代で結婚している人のうち、女性");
		 for(int i:marriedThirtiesFemaleIndexes) {
			 String id=ids[i];
			 String name=names[i];
			 int age=ages[i];
			 String gender=gendertypes[i]==0?"男":"女";
			 String mry=marriedflgs[i]?"既婚":"独身";
			 String message=String.format("{%s]%s 年齢:%s 性別:%s　結婚:%s",id,name,age,gender,mry);
			 System.out.println(message);
			 }
		 System.out.println("既婚男性");
		 for(int i:singleMaleIndexes) {
			 String id=ids[i];
			 String name=names[i];
			 int age=ages[i];
			 String gender=gendertypes[i]==0?"男":"女";
			 String mry=marriedflgs[i]?"既婚":"独身";
			 String message=String.format("{%s]%s 年齢:%s 性別:%s　結婚:%s",id,name,age,gender,mry);
			 System.out.println(message);
		 }
		 System.out.println("それ以外");
		 for(int i:others) {
			 String id=ids[i];
			 String name=names[i];
			 int age=ages[i];
			 String gender=gendertypes[i]==0?"男":"女";
			 String mry=marriedflgs[i]?"既婚":"独身";
			 String message=String.format("{%s]%s 年齢:%s 性別:%s　結婚:%s",id,name,age,gender,mry);
			 System.out.println(message);
			 }
	}
}
