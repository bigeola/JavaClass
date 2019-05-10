package com.teamrg.pojo;

public class DCD {
    private int    id;
	private String selectFlag;			//SELECT_FLAG;
	private String lookUpColumn;		//LOOKUP_COLUMN;
	private String arsModeCd;		    //ARS_MODE_CD;
	private String dscrP;			    //DSCRP_TX; 
    private String wpnSystem;
    private String dcdName;
    private String errorMessage;
    private String errorProcedure;
    private int    ret_status;
    private int    row_count;
    private String sortString;
    private String workConfigCode; // From what I can tell, used only in List of Config Code usage.
	
	/**
	 * 
	 */
	public DCD() {
	}

	/**
	 * @return the id
	 */
    public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
    public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the selectFlag
	 */
	public String getSelectFlag() {
		return selectFlag;
	}

	/**
	 * @param selectFlag the selectFlag to set
	 */
	public void setSelectFlag(String selectFlag) {
		this.selectFlag = selectFlag;
	}

	/**
	 * @return the lookUpColumn
	 */
	public String getLookUpColumn() {
		return lookUpColumn;
	}

	/**
	 * @param lookUpColumn the lookUpColumn to set
	 */
	public void setLookUpColumn(String lookUpColumn) {
		this.lookUpColumn = lookUpColumn;
	}

	/**
	 * @return the arsModeCd
	 */
	public String getArsModeCd() {
		return arsModeCd;
	}

	/**
	 * @param arsModeCd the arsModeCd to set
	 */
	public void setArsModeCd(String arsModeCd) {
		this.arsModeCd = arsModeCd;
	}

	/**
	 * @return the dscrP
	 */
	public String getDscrP() {
		return dscrP;
	}

	/**
	 * @param dscrP the dscrP to set
	 */
	public void setDscrP(String dscrP) {
		this.dscrP = dscrP;
	}

    /**
     * @return the wpnSystem
     */
    public String getWpnSystem() {
        return wpnSystem;
    }
    
    /**
     * @param wpnSystem the wpnSystem to set
     */
    public void setWpnSystem(String wpnSystem) {
        this.wpnSystem = wpnSystem;
    }
    
    /**
     * @return the dcdName
     */
    public String getDcdName() {
        return dcdName;
    }
    
    /**
     * @param dcdName the dcdName to set
     */
    public void setDcdName(String dcdName) {
        this.dcdName = dcdName;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }
    
    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    /**
     * @return the errorProcedure
     */
    public String getErrorProcedure() {
        return errorProcedure;
    }
    
    /**
     * @param errorProcedure the errorProcedure to set
     */
    public void setErrorProcedure(String errorProcedure) {
        this.errorProcedure = errorProcedure;
    }
    
    /**
     * @return the ret_status
     */
    public int getRet_status() {
        return ret_status;
    }
    
    /**
     * @param ret_status the ret_status to set
     */
    public void setRet_status(int ret_status) {
        this.ret_status = ret_status;
    }
    
    /**
     * @return the row_count
     */
    public int getRow_count() {
        return row_count;
    }
    
    /**
     * @param row_count the row_count to set
     */
    public void setRow_count(int row_count) {
        this.row_count = row_count;
    }
    
    /**
     * @return the sortString
     */
    public String getSortString() {
        return sortString;
    }
    
    /**
     * @param sortString the sortString to set
     */
    public void setSortString(String sortString) {
        this.sortString = sortString;
    }
    
    /**
     * @return the workConfigCode
     */
    public String getWorkConfigCode() {
        return workConfigCode;
    }
    
    /**
     * @param workConfigCode the workConfigCode to set
     */
    public void setWorkConfigCode(String workConfigCode) {
        this.workConfigCode = workConfigCode;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "DCD [id=" + id + ", selectFlag=" + selectFlag + ", lookUpColumn=" + lookUpColumn + ", arsModeCd="
                + arsModeCd + ", dscrP=" + dscrP + ", wpnSystem=" + wpnSystem + ", dcdName=" + dcdName
                + ", errorMessage=" + errorMessage + ", errorProcedure=" + errorProcedure + ", ret_status=" + ret_status
                + ", row_count=" + row_count + ", sortString=" + sortString + ", workConfigCode=" + workConfigCode
                + "]";
    }

	
	
	
	
}
