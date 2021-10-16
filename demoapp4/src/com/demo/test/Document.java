package com.demo.test;

public class Document {
		//private variables
	 	private String title;
	 	private String filepath;
	 	
	 	//getters and setters
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getFilepath() {
			return filepath;
		}
		public void setFilepath(String filepath) {
			this.filepath = filepath;
		}
	 	
		public String showDocumentInformation()
		{
			title = "java basics";
			filepath = ":c:/document/corejava/basics/introduction.pdf";
			return title + filepath;
		}
		 
	}


