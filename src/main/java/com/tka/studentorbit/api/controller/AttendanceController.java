package com.tka.studentorbit.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.studentorbit.api.entity.AttendanceRecord;
import com.tka.studentorbit.api.entity.Student;
import com.tka.studentorbit.api.entity.Subject;
import com.tka.studentorbit.api.entity.User;
import com.tka.studentorbit.api.model.AttendanceRecordRequest;
import com.tka.studentorbit.api.service.AttendanceRecordService;
import com.tka.studentorbit.api.service.StudentService;
import com.tka.studentorbit.api.service.SubjectService;
import com.tka.studentorbit.api.service.UserService;

@RestController
@RequestMapping("/attendance")
@CrossOrigin("http://localhost:4200")

public class AttendanceController {

	@Autowired
	private AttendanceRecordService attendanceRecordService;

	@Autowired
	private UserService userService;

	@Autowired
	private SubjectService subjectService;

	@Autowired
	private StudentService studentService;

	@GetMapping("/get-all-attendance-records")
	public List<AttendanceRecord> getAllAttendanceRecords() {
		return attendanceRecordService.getAllAttendanceRecords();
	}
	
	 @GetMapping("/get-attendance-by-faculty/{facultyUsername}")
	    public List<AttendanceRecord> getAttendanceByFaculty(@PathVariable String facultyUsername) {
	        return attendanceRecordService.getAttendanceByFaculty(facultyUsername);
	    }
	
	
	@GetMapping("/get-attendance-by-date-subjet/{date}/{subjectId}")
	public List<AttendanceRecord> getAllAttendanceRecords(@PathVariable String date,@PathVariable long subjectId){
		return attendanceRecordService.getAllAttendanceRecords(date,subjectId);
	}
	
	@GetMapping("/get-attendance/{user}/{subjectId}/{date}")
	public List<AttendanceRecord> getAttendanceByFacultySubjectDate(
	        @PathVariable String user, 
	        @PathVariable long subjectId, 
	        @PathVariable String date) {
	    return attendanceRecordService.getAttendanceByFacultySubjectDate(user, subjectId, date);
	}


	@PostMapping("/take-attendance")
	public AttendanceRecord createAttendanceRecord(@RequestBody AttendanceRecordRequest request) {
		User user = userService.getUserByName(request.getUsername());
		
	
		Subject subject = subjectService.getSubjectById(request.getSubjectId());
		
		AttendanceRecord attendanceRecord = new AttendanceRecord();
		attendanceRecord.setUser(user);
		attendanceRecord.setSubject(subject);
		attendanceRecord.setDate(request.getDate());
		attendanceRecord.setTime(request.getTime());
		attendanceRecord.setStudents(request.getStudents());
		attendanceRecord.setNumberOfStudents(request.getStudents().size());

		System.out.println(attendanceRecord);
		return attendanceRecordService.saveAttendance(attendanceRecord);
	}
}
