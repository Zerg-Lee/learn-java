import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Consumer;

public class ddd {
public static void main(String[]args){

        Scanner input = new Scanner("movies.txt") ;
        int num,rate;
        String name;
        HashMap<Integer,Integer> mapMovie = new HashMap<>();
        HashMap<String, HashMap<Integer,Integer>> mapReview =new HashMap<>();
        num = input.nextInt();
        for(int temp=0;temp<num;temp++)
        {
        name=input.nextLine();
        rate=input.nextInt();;
        mapReview.put<name,rate>;
        }
        map<int,int>::;
        map<string,map<int,int>>::iterator tempItr2;
        for(tempItr2=mapReview.begin();tempItr2!=mapReview.end();tempItr2++)
        {

        cout<<"\n "<<tempItr2->first<<endl;

        for(tempItr1=tempItr2->second.begin();tempItr1!=tempItr2->second.end();tempItr1++)
        {
        cout<<"\n"<<tempItr1->first<<endl;
        }
        }
        return(0);
        }
        }