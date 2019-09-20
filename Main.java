import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;


public class Main {
    public static void main(String[] args)throws IOException {


        var reader = new Scanner(System.in);
        System.out.print("How many fortunes do you want to see?");
        var user_number = reader.nextInt();
        var demo = new Main();
        var total = demo.second(user_number);
        System.out.print(total);

        }

    public long second(int something)throws IOException {
            var fileName = "list.txt";
            String all_names = Files.readString(Paths.get(fileName));
            String[] name_list = all_names.split("^");
            var chooser = new Random();
            var number = chooser.nextInt(name_list.length);
            for (int i = 1; i < something; i++) {
                System.out.print(number);

            }
            return number;



        }


    }

