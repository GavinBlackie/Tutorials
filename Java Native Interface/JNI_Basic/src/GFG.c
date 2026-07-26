#include <jni.h>
#include <stdio.h>
#include "GFG.h"

// Implementation of the native method, print_Hello!:
JNIEXPORT void JNICALL Java_GFG_print_1Hello(JNIEnv *env, jobject obj) {
   printf("Hello World!\n");
   printf("This is a printf from a C function!\n");
   printf("Patrick Star was here\n");
   return;
}

JNIEXPORT double JNICALL Java_GFG_multiply(
	JNIEnv* env, jobject obj,
	double a, double b) 
{
	return a * b;
}
											