package gaa.vargas.main;

import gaa.vargas.patterns.decorator.*;

public class UserValidation {
	
	
	public static void main(String args[]) {

		String value = "hey";
		
		ValidateComponent validateUser = new ValidateExtConcreteField();		
		ValidateMessage validateMessage = new ValidateMessage();
		
		
		validateUser = new ValidateExtDecoratorIsAlphanumericWithWhiteSpace(validateUser);
		validateUser = new ValidateExtDecoratorIsLettersWithWhiteSpace(validateUser);
			
		value = validateUser.validation(value,validateMessage);
		
		if (value.equals(validateMessage.getPass_validation()))
		{
		
			System.out.println("true"); 
			System.out.println(value); 
			
			System.out.println(validateUser.getWrapdecorators()); 
			
		}else 
		{
			System.out.println(value); 

			System.out.println("false"); 
			System.out.println(validateUser.getWrapdecorators()); 
			
		}
	

		value = validateUser.validation(null,validateMessage);
		if (value.equals(validateMessage.getPass_validation()))
	
		{
			System.out.println(value); 
		
			System.out.println("true"); 
			
			System.out.println(validateUser.getWrapdecorators()); 
			
		}else 
		{
			System.out.println(value); 

			System.out.println("false"); 
			System.out.println(validateUser.getWrapdecorators()); 
			
		}

		value = validateUser.validation("<<  >>",validateMessage);
		if (value.equals(validateMessage.getPass_validation()))
		{
			System.out.println(value); 
		
			System.out.println("true"); 
			
			System.out.println(validateUser.getWrapdecorators()); 
			
		}else 
		{
			System.out.println(value); 

			System.out.println("false"); 
			System.out.println(validateUser.getWrapdecorators()); 
			
		}
		
	
		value = validateUser.validation(" ",validateMessage);
		if (value.equals(validateMessage.getPass_validation()))
		{
			System.out.println(value); 
		
			System.out.println("true"); 
			
			System.out.println(validateUser.getWrapdecorators()); 
			
		}else 
		{
			System.out.println(value); 

			System.out.println("false"); 
			System.out.println(validateUser.getWrapdecorators()); 
			
		}
	
		value = validateUser.validation("11 aa",validateMessage);
		if (value.equals(validateMessage.getPass_validation()))
		{
			System.out.println(value); 
		
			System.out.println("true"); 
			
			System.out.println(validateUser.getWrapdecorators()); 
			
		}else 
		{
			System.out.println(value); 

			System.out.println("false"); 
			System.out.println(validateUser.getWrapdecorators()); 
			
		}
		
		
	}

}
