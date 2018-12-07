package org.grohe.ondus.api.actions;

import org.grohe.ondus.api.client.ApiClient;

public abstract class AbstractAction implements Action {
    private ApiClient apiClient;

    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
    }
}
