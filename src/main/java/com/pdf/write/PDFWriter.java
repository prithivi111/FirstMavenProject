package com.pdf.write;

import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFWriter {

	public static void main(String[] args) throws Exception {

		Document document = new Document();
		OutputStream file = new FileOutputStream("C:\\Users\\s011271sur\\eclipse-workspace\\FirstMavenProject\\src\\main\\resources\\test.pdf");

		PdfWriter pdfWriter = PdfWriter.getInstance(document, file);
		
		System.out.println("PDF create");

		// open PDF
		document.open();

		// adding paragraph
		document.add(new Paragraph("This is my first PDF file"));

		// close PDF
		document.close();
		

	}

}