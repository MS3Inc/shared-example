package com.mycompany.esb.logging.model;

public class LogEvent {
	private LogLevel logLevel = LogLevel.INFO;
	private String correlationId;
	private String message;
	private String flowName;
	private String applicationName;
	private String host;
	public LogEvent(LogLevel logLevel, String correlationId, String message, String flowName,
			String applicationName, String host) {
		super();
		this.logLevel = logLevel == null ? LogLevel.INFO : logLevel;
		this.correlationId = correlationId;
		this.message = message;
		this.flowName = flowName;
		this.applicationName = applicationName;
		this.host = host;
	}
	

	public LogLevel getLogLevel() {
		return logLevel;
	}


	public String getCorrelationId() {
		return correlationId;
	}


	public String getMessage() {
		return message;
	}


	public String getFlowName() {
		return flowName;
	}


	public String getApplicationName() {
		return applicationName;
	}


	public String getHost() {
		return host;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationName == null) ? 0 : applicationName.hashCode());
		result = prime * result + ((logLevel == null) ? 0 : logLevel.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEvent other = (LogEvent) obj;
		if (applicationName == null) {
			if (other.applicationName != null)
				return false;
		} else if (!applicationName.equals(other.applicationName))
			return false;
		if (logLevel != other.logLevel)
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LogEvent [correlationId=" + correlationId 
				+ ", host=" + host + ""
				+ ", applicationName=" + applicationName + ""
				+ ", flowName=" + flowName
				+ ", message=" + message + "]";
	}
	
	public static void main(String[] args){
		LogEvent le = new LogEvent(LogLevel.ERROR, "18057bc0-ba5b-4432-b9ad-e0f67826587c", "An unexpected error occured", "testprojectFlow", "testproject", "192.168.1.15");
		System.out.println(le);
	}
}
