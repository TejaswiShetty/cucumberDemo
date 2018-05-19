package com.objectRepo;

import org.apache.log4j.Logger;

public class ObjectRepo {
	
	final static Logger logger = Logger.getLogger(ObjectRepo.class);

	 public void ObjectRepoFunc()
		{
			System.out.println("This is object Repo.");
			
			if(logger.isDebugEnabled()){
				logger.debug("This is debug : "+this.getClass().getName() );
			}
			
			if(logger.isInfoEnabled()){
				logger.info("This is info :"+this.getClass().getName() );
			}
			
			logger.warn("This is warn : " +this.getClass().getName() );
			logger.error("This is error : "+this.getClass().getName() );
			logger.fatal("This is fatal : "+this.getClass().getName() );

		}
	 
		

}
