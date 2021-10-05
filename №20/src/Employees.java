public class Employees extends Person{
       public Employees(String name, int numberofhoursworkedlastweek, int hourlypayment,
                        String name1, int numberofhoursworkedlastweek1, int hourlypayment1,
                        String name2, int numberofhoursworkedlastweek2, int hourlypayment2) {
           super(name, numberofhoursworkedlastweek, hourlypayment, name1, numberofhoursworkedlastweek1, hourlypayment1,
                   name2, numberofhoursworkedlastweek2, hourlypayment2);
       }
       void say() {
           System.out.println(super.name);
           System.out.println(super.numberofhoursworkedlastweek);
           System.out.println(super.hourlypayment);
           System.out.println(super.name1);
           System.out.println(super.numberofhoursworkedlastweek1);
           System.out.println(super.hourlypayment1);
           System.out.println(super.name2);
           System.out.println(super.numberofhoursworkedlastweek2);
           System.out.println(super.hourlypayment2);
       }
}
