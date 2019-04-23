package seasons;

public class Inheritance {
	
	public class HelloWorld {
	    public String toString() {
	        return "HelloWorld!";
	    }
	}

	public class CustomizedHelloWorld extends HelloWorld {
	    private String name;
	    
	    public CustomizedHelloWorld(String name) {
	        this.name = name;
	    }
	    
	    public String toString() {
	        return "HelloWorld, " + name + "!";
	    }
	}
	
    public static void main(String[] args) {
    	Inheritance inheritance = new Inheritance();
        HelloWorld hw = inheritance.new CustomizedHelloWorld("TCP");
        new Inheritance().print(hw);
    }

    public void print(HelloWorld helloWorld) {
        System.out.println(helloWorld);
    }

    public void print(CustomizedHelloWorld cHelloWorld) {
        System.out.println("Ola, mundo!");
    }
}
