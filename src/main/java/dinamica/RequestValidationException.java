package dinamica;

/**
 * Exception triggered when request generic
 * validation fails
 * <br>
 * Creation date: 25/10/2003<br>
 * Last Update: 25/10/2003<br>
 * @author Martin Cordova
 */
public class RequestValidationException extends Throwable
{

	Recordset rs = new Recordset();

	public RequestValidationException()
	{
		/* create recordset to contain error messages for multiple parameters */
		try
		{
			rs.append("message", java.sql.Types.VARCHAR);
		}
		catch (RecordsetException e){}
	}
	
	/**
	 * Stores an error message
	 * @param msg Error message
	 */
	public void addMessage(String msg)
	{
		rs.addNew();
		try
		{
			rs.setValue("message", msg);
		}
		catch (RecordsetException e){}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage()
	{
		return "Generic request validation failed.";
	}

	/**
	 * Return recordset with list of errors. The recordset
	 * contains one column (message). May be printed using
	 * a regular Action and a template of you choice
	 * @return Recordset object containing error messages for each invalid parameter
	 */
	public Recordset getErrors()
	{
		return rs;
	}

}
