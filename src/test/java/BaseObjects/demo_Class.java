package BaseObjects;

import java.util.ArrayList;

import com.mongodb.*;


public class demo_Class {
	
	

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		str.add(args+"SIT"); 
		str.add(args+"UAT");
		str.add(args+"DEV");
		System.out.println("Hi"+args);
		System.out.println("Hi"+str);
		System.out.println("program arguments");
		for(String arg : args) {
			System.out.println("\t"+arg);
		}
		
		
		//-DprojectName=Anthem -DUrlName=SIT
		//VM arguments : -Dproperty1=techtalk --Dproperty2=debu
		System.out.println("System properity from VM arguments");
		String projectName = "projectName";
		System.out.println(projectName+"valve: "+System.getProperty(projectName));
		String UrlName = "UrlName";
		System.out.println(UrlName+"valve: "+System.getProperty(UrlName));
	}

	
	public void mongoDb() {
		//mongo-2.6.3
		//mongo-java-driver-2.12.2
		//cmd in bin folder type mongo
		
		try {
			MongoClient mongoClient = new MongoClient("localhost",27017);
			DB dbl = mongoClient.getDB("SIT");
			DBCollection collection = dbl.createCollection("Student", null);
			
			//insert data in collection
			BasicDBObject d1 = new BasicDBObject("name", "monika").append("roll", "1");
			collection.insert(d1);
			
			//in cmd showdbs
			//use SIT
			//show collections
			//db.student.find()
			
			
			DBCursor cur = collection.find();
			while(cur.hasNext()) {
				System.out.println(cur.next());
			}
			
			// remove Data
			BasicDBObject r1 = new BasicDBObject("name", "monika");
			collection.remove(r1);
			
			cur = collection.find();
			while(cur.hasNext()) {
				System.out.println(cur.next());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
