public class HTTPFormatter extends FormatDecorator {
	public HTTPFormatter(BaseLogger logger) {
		this.logger = logger;
	}

	public String getLabel() {
		return logger.getLabel() + ", HTTPFormatter";
	}

	public String getLevel() {
		return "Info " + logger.getLevel();
	}{
    
}
}

