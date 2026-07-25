
public class GFG {
	
	// Perplexity helped a lot in setting this up
	// since the tutorial is using an outdated IDE
	// that can no longer be accessed without online risks!
	// https://www.perplexity.ai/search/90c3b3fa-2fd4-484b-bb24-84b74c179553
	
	static {
		System.loadLibrary("hello");
	}
	
	// keyword: native -> like an abstract method -> but no implementation
	public native void print_Hello();
	
	public static void main(String[] args) {
		System.out.println("Java & C++ JNI Test!");
		GFG gfg = new GFG();
		gfg.print_Hello();
	}
}
