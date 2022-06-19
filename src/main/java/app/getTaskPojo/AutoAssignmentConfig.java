package main.java.app.getTaskPojo;

public class AutoAssignmentConfig {
    private boolean autoAssignment;
    private int  retryCount;
    private int   maxRetryCount;
    private int retryIntervalSec;


    public int getRetryCount ()
    {
        return retryCount;
    }

    public void setRetryCount (int retryCount)
    {
        this.retryCount = retryCount;
    }

    public int getMaxRetryCount ()
    {
        return maxRetryCount;
    }

    public void setMaxRetryCount (int maxRetryCount)
    {
        this.maxRetryCount = maxRetryCount;
    }

    public int getRetryIntervalSec ()
    {
        return retryIntervalSec;
    }

    public void setRetryIntervalSec (int retryIntervalSec)
    {
        this.retryIntervalSec = retryIntervalSec;
    }

    public boolean getAutoAssignment ()
    {
        return autoAssignment;
    }

    public void setAutoAssignment (boolean autoAssignment)
    {
        this.autoAssignment = autoAssignment;
    }
}
