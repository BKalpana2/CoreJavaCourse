package com.classPrograms;
public class CompanyMain {	
	//	public Company getCompany() {
	//		Company ref=new Company(101,"codethan",10,"vzn",22552.33);
	//		return ref;
	//	}
	public String[] getEmployeList() {
		String[] empList= {"Suman","Kumar","Lakshmi"};
		return empList;
	}
	public Company[] getCompanyList() {
		Company[] arr= {
				new Company(103,"Accenture",30,"Banglore",56789.2345),
				new Company(104,"Wipro",40,"Assam",8765.9876),
				new Company(105,"Facebook",29,"Gujarath",9876.54321),
				new Company(106,"Google",60,"Odisa",8765.43)
		};
		return arr;
	}
	public static void main(String[] args) {
		//		Company c1=new Company(100,"Codegnan",20,"Hyderabad",250000.876);
		//		int id=c1.getCompanyId();
		//		System.out.println("Company ID: "+id);
		//		String name=c1.getCompanyName();
		//		System.out.println("Company Name : "+name);
		//		int count=c1.getempCount();
		//		System.out.println("Employee Count : "+count);
		//		String location=c1.getcompanyLocation();
		//		System.out.println("Company Location : "+location);
		//		double turnOver=c1.getcompanyTurnOver();
		//		System.out.println("Company TurnOver : "+turnOver);
		//		System.out.println("**************************************");
		//		CompanyMain cm=new CompanyMain();
		//		Company obj=cm.getCompany();
		//		System.out.println(obj.getCompanyId());
		//		System.out.println(obj.getCompanyName());
		//		System.out.println(obj.getcompanyLocation());
		//		System.out.println(obj.getempCount());
		//		System.out.println(obj.getcompanyTurnOver());
		//		System.out.println("**************************************");
		CompanyMain c2=new CompanyMain();
		for(String st:c2.getEmployeList()) {
			System.out.println(st);
		}
		for(Company c:c2.getCompanyList()) {
			System.out.println("Company ID : "+c.companyId+"  Company Name : "+c.companyName +"  Company Location : "+c.companyLocation+"  Employee 		Count : "+c.empCount+"  Company Turn Over : "+c.companyTurnOver);
		}

	}
}
