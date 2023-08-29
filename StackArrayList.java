import java.util.ArrayList;
public class StackArrayList {
    static class stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public void push(int data){
            list.add(data);
        }
        public void pop(){
            if(list.size()==0){
                System.out.println("Empty List");
            }
            list.remove(list.size()-1);
        }
        public int peek(){
            if(list.size()==0){
                return -1;
            }
            return list.get(list.size()-1);
        }
        public static void main(String[] args){
            stack list1=new stack();
            list1.push(5);
            list1.push(6);
            list1.push(78);
            list1.push(23);
            list1.push(12);
            while(stack.list.size()!=0){
                System.out.println(list1.peek());
                list1.pop();
            }
        }
    }

}
