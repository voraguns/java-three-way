
import java.util.Arrays;
import java.util.Comparator;

class Start {
    public static void main(String[] args) {
        
        Player[] a = { new Player("David", 7),
                       new Player("Michael", 10),
                       new Player("Frank", 8),
                       new Player("Stephen", 4),
                       new Player("John", 2)
                     };
        
        Arrays.sort(a, new PlayerComparator());
        for(int i = 0; i < a.length; i++) {
            System.out.println(" " + a[i].name + " " + a[i].number);
        }
    }
}

class PlayerComparator implements Comparator {
    public int compare(Object a, Object b) {
        Player p = (Player) a;
        Player q = (Player) b;
        if (p.number < q.number) return -1;
        if (p.number > q.number) return +1;
        return 0;
    }
}

class Player {
    int number;
    String name;
    
    Player() { }
    
    Player(String name, int number) {
        this.name = name;
        this.number = number;
    }
}