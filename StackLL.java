package stacklinkedlist;

public class StackLL {
    public static void main(String[] args)
    {
        Stack st = new Stack();
        System.out.println("The stack elements:");
        st.push(50);
        st.push(30);
        st.push(70);
        st.print();
        
        st.peak();
        System.out.println("The poped elements:");
        st.pop();
        System.out.println("After stack elements:");
        st.print();
    }
}