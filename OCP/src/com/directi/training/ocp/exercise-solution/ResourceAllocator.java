package exerciseSolution;

import com.directi.training.ocp.exercise.ResourceType;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource)
    {
        int resourceId;
        resourceId = resource.findFreeSlot()
        resource.markSlotBusy(resourceId)
        return resourceId;
    }

    public void free(ResourceType resourceType, int resourceId)
    {
        int resourceId;
        resourceId = resource.findFreeSlot()
        resource.markSlotFree(resourceId)
    }
}

