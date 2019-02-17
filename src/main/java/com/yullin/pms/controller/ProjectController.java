package com.yullin.pms.controller;

import com.yullin.pms.model.Project;
import com.yullin.pms.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

/**
 * Project Model Class Controller
 */
@RestController
public class ProjectController {
	@Autowired
	private ProjectRepository projectRepository;

	/**
	 * 프로젝트 정보 등록
	 * @param project
	 * @return
	 */
	@PostMapping("/api/project")
	public ResponseEntity<Object> createProject(@RequestBody Project project) {
		Project savedProject = projectRepository.save(project);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			.buildAndExpand(savedProject.getProjectId()).toUri();

		return ResponseEntity.created(location).build();
	}

	@GetMapping("/api/projects")
	public List<Project> getProjects() {
		return projectRepository.findAll();
	}

	@GetMapping("/api/project/{id}")
	public Project getProject(@PathVariable Long id) throws Exception {
		Optional<Project> project = projectRepository.findById(id);
		if (!project.isPresent())
			throw new Exception("test");
		return project.get();
	}

	@PutMapping("/api/project/{id}")
	public ResponseEntity<Object> updateProject(@RequestBody Project project, @PathVariable Long id) {
		Optional<Project> projectOptional =  projectRepository.findById(id);

		if (!projectOptional.isPresent())
			return ResponseEntity.notFound().build();

		project.setProjectId(id);
		projectRepository.save(project);
		return ResponseEntity.noContent().build();
	}

//	@PatchMapping(value = "/{id}")
//	public ResponseEntity<Object> updateProject(@RequestBody Project project, @PathVariable Long id) {
//
//	}
}
