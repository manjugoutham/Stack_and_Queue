package queuelinkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class QueueList
{
    public static void main(String args[])throws IOException
    {
        Queue q=new Queue();
        int ch,d;
        while((boolean)true)
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter Your Choice: ");
            ch=Integer.parseInt(br.readLine());
            if(ch==5)
                break;
            else
            {
                switch(ch)
                {
                case 1:
                    System.out.println("Enter Number of Elements");
                    int n1=Integer.parseInt(br.readLine());
                    System.out.println("\nEnter elements: ");
                    for(int i=0; i<n1; i++)
                    {
                        d=Integer.parseInt(br.readLine());
                        q.insert(d);
                    }

                    break;
                case 2:
                    if(q.isQueueEmpty())
                        System.out.println("Queue is Empty ");
                    else
                    {
                        d=q.delete();
                        System.out.println("Deleted data:-  "+d);
                    }
                    break;
                case 3:
                    if(q.isQueueEmpty())
                        System.out.print("Queue is Empty ");
                    else
                    {
                        d=q.peek();
                        System.out.println("First item:-  "+d);
                    }
                    break;
                case 4:
                    if(q.isQueueEmpty())
                        System.out.println("Queue is Empty ");
                    else
                    {
                        System.out.println("Datas in Queue ");
                        q.display();
                    }
                    break;
                default:
                    System.out.println("Invalid choice ");
                }
            }
            System.out.println(" ");
        }
    }
}

