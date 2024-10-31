public class PriorityQueue {
    static class queue
    {
       char[] chars = new char[100];
       int[] ints =new int[100] ;
       int num=0;
       public void enqueue(char c,int i)
       {
           chars[num] = c;
           ints[num] = i;
           num++;
       }
       public void dequeue()
       {
           int max=0;
           int max_num=0;
           for(int search =0;search<=num;search++)
           {
                if(ints[search]>=max)
                {
                    max_num=search;
                    max=ints[search];
                }
           }
           for(int del=max_num;del<=num;del++)
           {
               ints[del]=ints[del+1];
               chars[del]=chars[del+1];
           }
       }
       public void show_the_array()
       {
           for(int i=0;i<=num;i++)
           {
               System.out.println(chars[i]+" ");
           }
       }
    }

    public static void main(String[] args) {
        queue q =new queue();
        q.enqueue('c',8);
        q.enqueue('b',1);
        q.enqueue('a',7);
        q.enqueue('A',10);
        q.dequeue();
        q.dequeue();
        q.show_the_array();

    }
}
