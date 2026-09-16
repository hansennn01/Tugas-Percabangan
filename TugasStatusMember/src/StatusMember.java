import java.util.Scanner;
public class StatusMember {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String statusMember;

        System.out.println("Silakan input status member anda (Gold, Silver, Bronze, atau Reguler)");
        statusMember = input.nextLine().toUpperCase();

        if (statusMember.equals("GOLD")){
            System.out.println("Status member: Gold \nSelamat! Anda mendapatkan diskon 20%");
        }
            else if(statusMember.equals("SILVER")){
                System.out.println("Status member: Silver \nSelamat! Anda mendapatkan diskon 15%");
            }

            else if (statusMember.equals("BRONZE")) {
                System.out.println("Status member: Bronze \nSelamat! Anda mendapatkan diskon 10%");
            }

            else if (statusMember.equals("REGULER")){
                System.out.println("Status member: Reguler \nTidak ada diskon (0%)");
            }
            else {
                System.out.println("Silakan masukkan status member yang benar");
            }

        
        
    
            

    
        
    }
}