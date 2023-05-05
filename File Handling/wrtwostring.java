class sc{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		try {
		File f=new File("C:\\Users\\siddh\\OneDrive\\Desktop\\obj.txt");
		if(f.createNewFile()) {
			System.out.println(f.getName());		
		}
		else {
			System.out.println("file already existed.");
		}
		if(f.canWrite()) {
		FileWriter fw=new FileWriter(f);
		fw.write(s1);
		fw.write("\n");
		fw.write(s2);
		
		fw.close();
		}
		else {
			System.out.println("file cannot Writable.");
		}
		if(f.canRead()) {
			FileReader fr=new FileReader(f);
			BufferedReader bf=new BufferedReader(fr);
			String str1=bf.readLine();
			String str2=bf.readLine();
			bf.close();
			fr.close();
			System.out.println(str1);
			System.out.println(str2);
		}
		else {
			System.out.println("file cannot reable.");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	 
		
		
	
}
