package edu.cmu.cs.glacier.tests;

import edu.cmu.cs.glacier.qual.*;

@Immutable public class IncorrectUsage {
	public void okMethod(IncorrectUsage this) {
		
	}
	
	public void okMethod2(@Immutable IncorrectUsage this) {
		
	}
	
	//::error: (type.invalid)
	public void badMethod(@Mutable IncorrectUsage this) {
		
	}
	
	//::error: (type.invalid)
	public void badMethod2(@Mutable IncorrectUsage obj) {
		
	}
}


class IncorrectUsage2 {
	public void okMethod(IncorrectUsage2 this) {
		
	}
	
	public void okMethod2(@Mutable IncorrectUsage2 this) {
		
	}
	
	//::error: (type.invalid)
	public void badMethod(@Immutable IncorrectUsage2 this) {
		
	}
	
	//::error: (type.invalid)
	public void badMethod2(@Immutable IncorrectUsage2 obj) {
		
	}
}

