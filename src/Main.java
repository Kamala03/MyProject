

class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private String fin;


    private Customer(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.fin = builder.fin;
    }


    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String fin;


        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder fin(String fin) {
            this.fin = fin;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }


    @Override
    public String toString() {
        return "Builder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", fin='" + fin + '\'' +
                '}';
    }
}


public class Main{
    public static void main(String[] args) {
        Customer customer = new Customer.Builder().firstName("Kamala").lastName("Bagirova").age(22).fin("338GKLY").build();

        System.out.println(customer);
    }
}

