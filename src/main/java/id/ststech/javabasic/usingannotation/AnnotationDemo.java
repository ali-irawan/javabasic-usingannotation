package id.ststech.javabasic.usingannotation;

import java.lang.annotation.Annotation;

import id.ststech.javabasic.usingannotation.annotation.DocInfo;

public class AnnotationDemo {

	public static void main(String[] args) {

		// Mendapatkan semua annotation dari class MyClass
		Annotation[] annotations = MyClass.class.getAnnotations();
		
		if(annotations != null) {
			for(Annotation item : annotations) {
				if(item instanceof DocInfo) {
					// Aman untuk di type cast menjadi DocInfo karena sudah dicheck sebelumnya
					DocInfo temp = (DocInfo) item;
					
					System.out.println("Author: " + temp.author());
					System.out.println("Date: " + temp.date());
					System.out.println("Current Revision: " + temp.currentRevision());
				}
			}
		}
	}

}
