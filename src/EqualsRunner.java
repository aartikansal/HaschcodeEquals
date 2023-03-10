import java.util.Objects;

public class EqualsRunner {
    static class Client{
        private int id;

        public Client(int id) {
            super();
            this.id = id;
        }
        //equals
        //hashcode
        //whenever you implement equal method, hashcode should be implemented

        @Override
        public boolean equals(Object that) {
            if (this == that) return true;
            if (that == null || getClass() != that.getClass()) return false;
            Client client = (Client) that;
            return id == client.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
    public static void main(String[] args) {
        Client c1= new Client(1);
        Client c2 = new Client(1);
        Client c3 = new Client(2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

    }
}