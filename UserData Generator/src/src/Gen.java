package src;
import java.io.*;
import java.util.*;

public class Gen  {
	static FileWriter fw;
	FileReader fr;
	BufferedReader br;
	static BufferedWriter bw;
	ArrayList <String> commands;
	static String path;
	public Gen()
	{
		commands = new ArrayList<String>();
		addCommands();
	}
	public void addCommands(){
		commands.add("ls");
		commands.add("grep");
		commands.add("chmod");
		commands.add("vi");
		commands.add("cat");
		commands.add("gcc");
		commands.add("cc");
		commands.add("javac");
		commands.add("java");
		commands.add("mysql");
		commands.add("cd");
		commands.add("mkdir");
		commands.add("dir");
		commands.add("rm");
		commands.add("rmdir");
		commands.add("cp");
		commands.add("man");
		commands.add("mv");
		commands.add("whatis");
		commands.add("whereis");
		commands.add("make");
		commands.add("who");
		commands.add("touch");
		commands.add("whois");
	}
	public int rand(int size)
	{
		Random rn= new Random();
		int randomnumber;
		randomnumber=rn.nextInt() % size;
		return randomnumber;
	}
	public static void main(String[] args){
		int randomnumber;
		Gen g=new Gen();
		System.out.print("Enter number of Commands per file   ");
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		for(int i=1;i<=20;i++){
			path=".//dataset//userdata//";
			path=path+"user"+i+".txt";
			System.out.println(path);
			try {
				fw = new FileWriter(path);
				bw = new BufferedWriter(fw);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int j=0;j<num;){
				randomnumber=g.rand(g.commands.size());
				if(randomnumber>=0)
				{
					try {
						bw.write(g.commands.get(randomnumber));
						bw.newLine();
						bw.flush();
						System.out.println(g.commands.get(randomnumber));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					j++;
				}
			}
		}
	}
}
