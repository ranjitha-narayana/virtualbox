interface Emp{
    name:String;
    age:number;
    salary?:number;
    display?():string;
}
    
    
    
    var emp={'name':'sagar','age':23,'salary':2345,'city':'bnglr'};//here the object or interface is invoked
    //it will accept any variable
    console.log(emp.city);
    var emp1:Emp={'name':'sagar','age':23,'salary':2345}; //this will invoke interface variables
    //json will accept only the varible which are declared in the interface
    
    
    
    var emp2:Emp={
    'name':'sagar',
    'age':23,
    display: (): string => {
    return "hi this is text demo";
    }
    

    
    }
  //here the salary variable is optional
    

    
    
    console.log('------------------------')
    console.log("employee name :" +emp1.name);
    console.log("employee age :" +emp1.age);
    console.log("employee salary :" +emp1.salary);
    
    
    
    console.log('------------------------')
    console.log("employee name :" +emp2.name);
    console.log("employee age :" +emp2.age);
    console.log("employee salary :" +emp2.salary);