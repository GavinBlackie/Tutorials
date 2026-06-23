
public class Main {
	
	static {
		
		System.out.println(System.getProperty("java.library.path"));
		System.loadLibrary("helloWorld.cpp");
	}
	
	public native void helloWorld();
	
	public static void main(String[] args) {
		
		// This is an area for me to test use between C++ and Java code,
		// which is something I want to do for a major Data Structures Project
		// that I want to do in the future! :))
		//
		// https://codingtechroom.com/question/how-to-integrate-c-c-code-within-java-application
		// ^ this is a reference/simple tutorial website that is useful for this!
		// 
		// It uses JNI, Java Native Interface, to allow Java
		// to both call C++ code, or be called by C++ code
	
		new Main().helloWorld();
	
	}
}
