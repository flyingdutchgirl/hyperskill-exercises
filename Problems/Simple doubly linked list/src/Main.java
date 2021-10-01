import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MyList myList = new MyList();
        
        for (int i = 0 ; i < n; i++) {
            String line = sc.nextLine();
            myList.parseCommand(line);
        }
        
        myList.output();
    }
    
    static class MyList {
        private LinkedList<String> list;
        
        MyList() {
            list = new LinkedList<>();
        }
        
        public void parseCommand(String command) {            
            String[] text = command.split("\\s+");
            
            switch (text[0]) {
                case "addFirst": {
                    list.addFirst(text[1]);
                    break;
                }
                
                case "addLast": {
                    list.addLast(text[1]);
                    break;
                }
                
                case "removeFirst": {
                    list.removeFirst();
                    break;
                }
                
                case "removeLast": {
                    list.removeLast();
                    break;
                }
                
                case "reverse": {
                    Collections.reverse(list);
                    break;
                }
                
                default: {
                    System.out.println("Wrong input! " + Arrays.toString(text));
                    break;
                }
            }
        }
        
        public void output() {
            for (String s: this.list) {
                System.out.print(s + " ");
            }
        }
        
        
        
    }
    
}
