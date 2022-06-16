package main.java.app.pojo;

public class CreateNewTaskPojo {

    private String transportType;
    private float amountToBeCollected;
    private String pickupByUtc;
    private String deliverByUtc;
    private String companyId;
    private String executingCompanyId;
    private String notes;
    private String priority;
    private String canGroupTask;
    private float pickupToDeliveryDistanceKm;
    private float driverToPickupDistanceKm;
    private float pickupToDeliveryEtaMin;
    private String status;
    private String paymentStatus;
    private int paymentStatusId;
    private boolean didAutoAssign;
    private String shortId;
    private String clientGeneratedId;
    private float totalCollectionAmountRemaining;
    private float totalAmountCollected;
    private boolean isOffloaded;
    private String offloadingResponsibilityInfo;
    private String taskAgentDetails;
    private String id;
    private String createdAtUtc;
    private String createdBy;
    private String updatedAtUtc;
    private String updatedBy;
    private CreateTaskMetaDataFields[] metaDataFields;
    private CreateTaskItems[] taskItems;
    private CreateTaskSkillCriteriaDto skillCriteriaDto;
    private CreateTaskAutoAssignment autoAssignmentConfig;
    private CreateTaskDelivery delivery;
    private CreateTaskPickUp pickup;

    public float getDriverToPickupDistanceKm ()
    {
        return driverToPickupDistanceKm;
    }

    public void setDriverToPickupDistanceKm (float driverToPickupDistanceKm)
    {
        this.driverToPickupDistanceKm = driverToPickupDistanceKm;
    }

    public String getShortId ()
    {
        return shortId;
    }

    public void setShortId (String shortId)
    {
        this.shortId = shortId;
    }

    public String getCanGroupTask ()
    {
        return canGroupTask;
    }

    public void setCanGroupTask (String canGroupTask)
    {
        this.canGroupTask = canGroupTask;
    }

    public boolean getDidAutoAssign ()
    {
        return didAutoAssign;
    }

    public void setDidAutoAssign (boolean didAutoAssign)
    {
        this.didAutoAssign = didAutoAssign;
    }

    public String getNotes ()
    {
        return notes;
    }

    public void setNotes (String notes)
    {
        this.notes = notes;
    }

    public String getPickupByUtc ()
    {
        return pickupByUtc;
    }

    public void setPickupByUtc (String pickupByUtc)
    {
        this.pickupByUtc = pickupByUtc;
    }

    public String getDeliverByUtc ()
    {
        return deliverByUtc;
    }

    public void setDeliverByUtc (String deliverByUtc)
    {
        this.deliverByUtc = deliverByUtc;
    }

    public CreateTaskSkillCriteriaDto getSkillCriteriaDto ()
    {
        return skillCriteriaDto;
    }

    public void setSkillCriteriaDto (CreateTaskSkillCriteriaDto skillCriteriaDto)
    {
        this.skillCriteriaDto = skillCriteriaDto;
    }

    public float getPickupToDeliveryEtaMin ()
    {
        return pickupToDeliveryEtaMin;
    }

    public void setPickupToDeliveryEtaMin (float pickupToDeliveryEtaMin)
    {
        this.pickupToDeliveryEtaMin = pickupToDeliveryEtaMin;
    }

    public int getPaymentStatusId ()
    {
        return paymentStatusId;
    }

    public void setPaymentStatusId (int paymentStatusId)
    {
        this.paymentStatusId = paymentStatusId;
    }

    public CreateTaskMetaDataFields[] getMetaDataFields ()
    {
        return metaDataFields;
    }

    public void setMetaDataFields (CreateTaskMetaDataFields[] metaDataFields)
    {
        this.metaDataFields = metaDataFields;
    }

    public String getCreatedAtUtc ()
    {
        return createdAtUtc;
    }

    public void setCreatedAtUtc (String createdAtUtc)
    {
        this.createdAtUtc = createdAtUtc;
    }

    public boolean getIsOffloaded ()
    {
        return isOffloaded;
    }

    public void setIsOffloaded (boolean isOffloaded)
    {
        this.isOffloaded = isOffloaded;
    }

    public CreateTaskAutoAssignment getAutoAssignmentConfig ()
    {
        return autoAssignmentConfig;
    }

    public void setAutoAssignmentConfig (CreateTaskAutoAssignment autoAssignmentConfig)
    {
        this.autoAssignmentConfig = autoAssignmentConfig;
    }

    public String getTaskAgentDetails ()
    {
        return taskAgentDetails;
    }

    public void setTaskAgentDetails (String taskAgentDetails)
    {
        this.taskAgentDetails = taskAgentDetails;
    }

    public String getTransportType ()
    {
        return transportType;
    }

    public void setTransportType (String transportType)
    {
        this.transportType = transportType;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getExecutingCompanyId ()
    {
        return executingCompanyId;
    }

    public void setExecutingCompanyId (String executingCompanyId)
    {
        this.executingCompanyId = executingCompanyId;
    }

    public String getPaymentStatus ()
    {
        return paymentStatus;
    }

    public void setPaymentStatus (String paymentStatus)
    {
        this.paymentStatus = paymentStatus;
    }

    public String getUpdatedAtUtc ()
    {
        return updatedAtUtc;
    }

    public void setUpdatedAtUtc (String updatedAtUtc)
    {
        this.updatedAtUtc = updatedAtUtc;
    }

    public CreateTaskDelivery getDelivery ()
    {
        return delivery;
    }

    public void setDelivery (CreateTaskDelivery delivery)
    {
        this.delivery = delivery;
    }

    public String getUpdatedBy ()
    {
        return updatedBy;
    }

    public void setUpdatedBy (String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    public CreateTaskItems[] getTaskItems ()
    {
        return taskItems;
    }

    public void setTaskItems (CreateTaskItems[] taskItems)
    {
        this.taskItems = taskItems;
    }

    public CreateTaskPickUp getPickup ()
    {
        return pickup;
    }

    public void setPickup (CreateTaskPickUp pickup)
    {
        this.pickup = pickup;
    }

    public String getPriority ()
    {
        return priority;
    }

    public void setPriority (String priority)
    {
        this.priority = priority;
    }

    public float getTotalCollectionAmountRemaining ()
    {
        return totalCollectionAmountRemaining;
    }

    public void setTotalCollectionAmountRemaining (float totalCollectionAmountRemaining)
    {
        this.totalCollectionAmountRemaining = totalCollectionAmountRemaining;
    }

    public float getTotalAmountCollected ()
    {
        return totalAmountCollected;
    }

    public void setTotalAmountCollected (float totalAmountCollected)
    {
        this.totalAmountCollected = totalAmountCollected;
    }

    public String getCompanyId ()
    {
        return companyId;
    }

    public void setCompanyId (String companyId)
    {
        this.companyId = companyId;
    }

    public String getCreatedBy ()
    {
        return createdBy;
    }

    public void setCreatedBy (String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getClientGeneratedId ()
    {
        return clientGeneratedId;
    }

    public void setClientGeneratedId (String clientGeneratedId)
    {
        this.clientGeneratedId = clientGeneratedId;
    }

    public String getOffloadingResponsibilityInfo ()
    {
        return offloadingResponsibilityInfo;
    }

    public void setOffloadingResponsibilityInfo (String offloadingResponsibilityInfo)
    {
        this.offloadingResponsibilityInfo = offloadingResponsibilityInfo;
    }

    public float getPickupToDeliveryDistanceKm ()
    {
        return pickupToDeliveryDistanceKm;
    }

    public void setPickupToDeliveryDistanceKm (float pickupToDeliveryDistanceKm)
    {
        this.pickupToDeliveryDistanceKm = pickupToDeliveryDistanceKm;
    }

    public float getAmountToBeCollected ()
    {
        return amountToBeCollected;
    }

    public void setAmountToBeCollected (float amountToBeCollected)
    {
        this.amountToBeCollected = amountToBeCollected;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }







}
