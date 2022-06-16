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

    public String getDidAutoAssign ()
    {
        return didAutoAssign;
    }

    public void setDidAutoAssign (String didAutoAssign)
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

    public SkillCriteriaDto getSkillCriteriaDto ()
    {
        return skillCriteriaDto;
    }

    public void setSkillCriteriaDto (SkillCriteriaDto skillCriteriaDto)
    {
        this.skillCriteriaDto = skillCriteriaDto;
    }

    public String getPickupToDeliveryEtaMin ()
    {
        return pickupToDeliveryEtaMin;
    }

    public void setPickupToDeliveryEtaMin (String pickupToDeliveryEtaMin)
    {
        this.pickupToDeliveryEtaMin = pickupToDeliveryEtaMin;
    }

    public String getPaymentStatusId ()
    {
        return paymentStatusId;
    }

    public void setPaymentStatusId (String paymentStatusId)
    {
        this.paymentStatusId = paymentStatusId;
    }

    public MetaDataFields[] getMetaDataFields ()
    {
        return metaDataFields;
    }

    public void setMetaDataFields (MetaDataFields[] metaDataFields)
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

    public String getIsOffloaded ()
    {
        return isOffloaded;
    }

    public void setIsOffloaded (String isOffloaded)
    {
        this.isOffloaded = isOffloaded;
    }

    public AutoAssignmentConfig getAutoAssignmentConfig ()
    {
        return autoAssignmentConfig;
    }

    public void setAutoAssignmentConfig (AutoAssignmentConfig autoAssignmentConfig)
    {
        this.autoAssignmentConfig = autoAssignmentConfig;
    }

    public null getTaskAgentDetails ()
    {
        return taskAgentDetails;
    }

    public void setTaskAgentDetails (null taskAgentDetails)
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

    public Delivery getDelivery ()
    {
        return delivery;
    }

    public void setDelivery (Delivery delivery)
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

    public TaskItems[] getTaskItems ()
    {
        return taskItems;
    }

    public void setTaskItems (TaskItems[] taskItems)
    {
        this.taskItems = taskItems;
    }

    public Pickup getPickup ()
    {
        return pickup;
    }

    public void setPickup (Pickup pickup)
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

    public String getTotalCollectionAmountRemaining ()
    {
        return totalCollectionAmountRemaining;
    }

    public void setTotalCollectionAmountRemaining (String totalCollectionAmountRemaining)
    {
        this.totalCollectionAmountRemaining = totalCollectionAmountRemaining;
    }

    public String getTotalAmountCollected ()
    {
        return totalAmountCollected;
    }

    public void setTotalAmountCollected (String totalAmountCollected)
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

    public null getOffloadingResponsibilityInfo ()
    {
        return offloadingResponsibilityInfo;
    }

    public void setOffloadingResponsibilityInfo (null offloadingResponsibilityInfo)
    {
        this.offloadingResponsibilityInfo = offloadingResponsibilityInfo;
    }

    public String getPickupToDeliveryDistanceKm ()
    {
        return pickupToDeliveryDistanceKm;
    }

    public void setPickupToDeliveryDistanceKm (String pickupToDeliveryDistanceKm)
    {
        this.pickupToDeliveryDistanceKm = pickupToDeliveryDistanceKm;
    }

    public String getAmountToBeCollected ()
    {
        return amountToBeCollected;
    }

    public void setAmountToBeCollected (String amountToBeCollected)
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
