//DEMO
public class demo {

public static void main (String args[])

{
    Hospital h1= new Hospital("Appollo");
    int choice=0;
    Doctor o = new Doctor("Rai","Surgeon");
    Doctor o1 = new Doctor("James","Opthalmologist");
     Doctor o2 = new Doctor("Steve","ENT");
    System.out.println("Press 1 to add doctor \n Press 2 to show doctors.\n Press 3 to add patient \n 4 Assign doctor to patients\n 5 Doctor and their patients ");
    Scanner cin = new Scanner (System.in);
    choice = cin.nextInt();
    switch (choice)
    {
    case 1:     h1.addDoctor(o);
                    h1.addDoctor(o1);
                    h1.addDoctor(o2);
                  //  break;                
    case 2:    {   System.out.println(h1.showDoctors());

               }    
    case 3:     {   Patient p = new Patient ("Steven ",21,"Male","eye");
                    Patient p1 = new Patient ("Michael ",12,"Male","heart patient");
                    Patient p2 = new Patient ("Sara ",23,"Female","earnose");
                    Patient p3 = new Patient ("Amy ",31,"Female","earnose");
                    Patient p5 = new Patient ("Rocky ",18,"Male","eye");
                    Patient p4= new Patient ("Jessy ",15,"Male","heart patient");
                    h1.addPatient(p);
                    h1.addPatient(p1);
                    h1.addPatient(p2);
                    h1.addPatient(p3);
                    h1.addPatient(p4);
                    h1.addPatient(p5);
                     System.out.println(h1.showPatients());
                }   
    case 4:     {
                     h1.assignDoctor();
                }

    case 5:     {
                      System.out.println("\n \n \n "+ ""+o2.getDoctorName()+""+o2.getDoctorPatientList());
                }
    }
    }}