package com.Coffee_Ordering_Application.member;

import com.Coffee_Ordering_Application.member.dto.MemberPostDto;
import com.Coffee_Ordering_Application.member.entity.Member;
import com.Coffee_Ordering_Application.member.mapper.MemberMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/members")
@Validated
@Slf4j
public class Controller {
    private final MemberService memberService;
    private final MemberMapper mapper;

    public Controller(MemberService memberService, MemberMapper mapper) {
        this.memberService = memberService;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody MemberPostDto memberDto) {
        Member member = mapper.memberPostDtoToMember(memberDto);
        Member response = memberService.createMember(member);
        return new ResponseEntity<>(mapper.memberToMemberResponseDto(response),
                HttpStatus.CREATED);
    }
}
