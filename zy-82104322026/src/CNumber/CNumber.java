//package CNumber;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class CNumber {
//
//	public static void main(String[] args) {
//		
//		System.out.println("请输入玩家1信息(姓名):");
//		Scanner sc=new Scanner(System.in);
//	    String name1=sc.next();
//	    System.out.println("请输入玩家2信息(姓名):");
//	    String name2=sc.next();
//	    
//		player player1=new player(name1,0);
//		player player2=new player(name2,0);
//		fh fh_suiji=new fh();
//		player1.getimage();
//		player2.getimage();
//		
//		jishi js=new jishi();
//		random ra=new random();
//		
//		long startTime1=js.start();
//		int ran2=ra.raInt();
//		fh_suiji.get(ran2);
//		System.out.println("随机数已生成，游戏开始");
//		
//		for(int i=0;true;i++) {
//	    int playmessage1=player1.platersc();
//		int flag=player1.playerpanduan(playmessage1, ran2);
//		int playmessage2=player2.platersc();
//		int flag2=player2.playerpanduan(playmessage2, ran2);
//		if(flag==1) {
//			System.out.println(player1.name+"WIN!");
//			break;
//		}else if(flag==2) {
//			System.out.println("大了");
//		}else if(flag==3) {
//			System.out.println("小了");
//		}else if(flag==4) {
//			System.out.println("GAME OVER");
//			break;
//		}
//		if(flag2==1) {
//			System.out.println(player2.name+"WIN!");
//			break;
//		}else if(flag2==2) {
//			
//			System.out.println("大了");
//		}else if(flag2==3) {
//			System.out.println("小了");
//		}else if(flag2==4) {
//			System.out.println("GAME OVER");
//			break;
//		}
//		
//		}
//		
//		
//		
//		System.out.println("本轮的正确答案是:"+ran2);
//	
//    long endTime1=js.end();
//    System.out.println((endTime1-startTime1)/1000+'秒');
//	}
//   
//
//
//}
//class fh{
//	public int get(int a){
//		return a;
//	}
//}
//class jishi {
//	public long start() {
//		/** 获取当前系统时间*/
//	    long startTime =  System.currentTimeMillis();
//	    /** 程序运行 processRun();*/
//	    return startTime;
//	    /** 获取当前的系统时间，与初始时间相减就是程序运行的毫秒数，除以1000就是秒数*/
////	    long endTime =  System.currentTimeMillis();
////	    long usedTime = (endTime-startTime)/1000;
//	    
//	}
//	public long end() {
//		long endTime =  System.currentTimeMillis();
//	    return endTime;
//	}
//	
//}
//
//class random{
//	
//	
//	public int raInt() {
//		Random r = new Random();
//	    int ran1 = r.nextInt(100);
//	    return ran1;
//	}
//	
//}
//
//class player{
//
//	String name;
//	Scanner sc=new Scanner(System.in);
//	int ex;
//	  @Override
//	public String toString() {
//		return "player [name=" + name + " ex=" + ex + "]";
//	}
//	public player(String name, int ex) {
//		this.name=name;
//	
//		this.ex=ex;
//	}
//  public void getimage() {
//	  System.out.println("玩家姓名:"+this.name+"玩家经验:"+this.ex);
//}
//  public int platersc() {
//	  
//	  int playmessage=sc.nextInt();
//	  return playmessage;
//	  
//  }
//  public int playerpanduan(int playmessage,int ran2) {
//	  
//		  if(ran2==playmessage) {
//		  return 1;
//		
//	  }else if(ran2<playmessage){
//		 return 2;
//		 
//	  }else if(ran2>playmessage) {
//		  return 3;
//		 
//	  }else if(playmessage==1000) {
//		 return 4;
//		 }else {
//			 return 5;
//		 }
//		  }
//	  
//  
//}
