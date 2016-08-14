package Dao;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;



@JsonAutoDetect
public class ReturnType implements Serializable {

	  /**
	 * 
	 */
	 private static final long serialVersionUID = 1L;


	  private String status = "";
	  private String errorMessage = "";
	  private Object returnData;
	 
	  public ReturnType(String status, String errorMessage) {
	    this.status = status;
	    this.errorMessage = errorMessage;
	    }
	  
		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrorMessage() {
			return errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Object getReturnData() {
			return returnData;
		}

		public void setReturnData(Object returnData) {
			this.returnData = returnData;
		}
}
