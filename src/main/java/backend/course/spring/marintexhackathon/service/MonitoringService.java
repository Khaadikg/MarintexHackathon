package backend.course.spring.marintexhackathon.service;

import backend.course.spring.marintexhackathon.dto.request.MonitoringRequest;
import backend.course.spring.marintexhackathon.dto.response.MonitoringResponse;
import backend.course.spring.marintexhackathon.entity.Monitoring;

public interface MonitoringService {
    String postMonitoring(MonitoringRequest monitoringRequest);
    MonitoringResponse getMonitoringResponse(Long id);
}
