class Car{
	
	String name, model;
	int engine, cost;
	
	void insertdata(String n, String m, int e, int c){ 		//Insert data method
		name = n;
		model = m;
		engine = e;
		cost = c;}
		
	void displaydata(){ 									//Display data method
		
		System.out.println(name+" "+model+" "+engine+" "+cost);}
	
	public static void main(String[] args){
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		//Initializing the data to the variables by invoking the insert data method
		
		c1.insertdata("Audi","AS7",4000,7898987);
		c2.insertdata("Mercedes","M18",3500,878098);
		c3.insertdata("Hyundai","i20",2000,767878);
		
		//Displaying data of the objects by invoking display data method
		
		c1.displaydata();
		c2.displaydata();
		c3.displaydata();}

}
	
	//=======================================================================================
	
class Rectangle{
	int length;
	int width;
	
	void insertdata(int l,int w){
	length = l;
	width = w;}
	
	void calculateArea(){
		System.out.println(length*width);}
		
	public static void main(String[] args){
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		
		r1.insertdata(15,5);
		r2.insertdata(20,5);
		r3.insertdata(5,5);
		
		r1.calculateArea();
		r2.calculateArea();
		r3.calculateArea();}
}

//==========================================================================================


class Student{

	String name;
	int rollid;
	
	void insert(String n, int r){
	
	name = n;
	rollid = r;}

	void displayinformation(){
	System.out.println(name+"  "+rollid);}
	
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.insert("John",1946);
		s2.insert("Elisa",1947);
		
		s1.displayinformation();
		s2.displayinformation();}
}

//============================================================================================