import java.util.Scanner;

class AddAndDelete {

    public static void main(String[] args) {
        

        int a = 0;

        String[] names = {"VIOLET SMITH", "JAMES BARCLAY"};
        String[] number = {"(312) 223-1937", "(418) 665-1223"};

        while(a == 0){


            Scanner scan = new Scanner(System.in);
            System.out.println("Name? If you want to delete, type delete. If you want to add, type add.");
            String name = scan.nextLine();
            name = name.toUpperCase();
            boolean check = false;


            if(name.equals("QUIT")){
                System.out.println("Goodbye");
                break;

            }

            else if(name.equals("ADD")){

                System.out.println("Who would you like to add?");
                String newName = scan.nextLine();
                

                System.out.println("What is their number?");
                String newNumber = scan.nextLine();

            }

            else if(name.equals("DELETE")){

                System.out.println("Who would you like to delete.");
                String toDelete = scan.nextLine();
                toDelete = toDelete.toUpperCase();

            }

            else{

                for(int i = 0; i < names.length; i++){

                    if(name.equals(names[i])){
                        System.out.println("The number is: " + number[i]);
                        check = true;
                    }


                }

            }

            if(!check){
                System.out.println("There are no results for that name.");
            }


        }

    }






}