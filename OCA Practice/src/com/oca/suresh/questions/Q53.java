package com.oca.suresh.questions;
interface Exportable
{
	void export();
	
}
class Tool implements Exportable
{

	@Override
     public void export() 
	{
       System.out.println("export() in Tool Class");		
	}
	
}

class ReportTool extends Tool implements Exportable
{

	@Override
	public void export() 
	{
       System.out.println("export() in ReportTool Class");		
	}
	
}
public class Q53 
{

	public static void callExport(Exportable ex)
	{
		ex.export();
	}
	
	public static void main(String[] args) 
	{
		Tool a = new ReportTool();
		Tool b = new Tool();
		callExport(a);
		callExport(b);

	}

}
