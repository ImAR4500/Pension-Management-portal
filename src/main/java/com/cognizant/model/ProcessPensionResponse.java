package com.cognizant.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ProcessPensionResponse {
	private int processPensionStatusCode;

	public int getProcessPensionStatusCode() {
		return processPensionStatusCode;
	}

	public void setProcessPensionStatusCode(int processPensionStatusCode) {
		this.processPensionStatusCode = processPensionStatusCode;
	}
	public ProcessPensionResponse() {}
	public ProcessPensionResponse(int processPensionStatusCode) {
		super();
		this.processPensionStatusCode = processPensionStatusCode;
	}

}
