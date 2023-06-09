package com.Coffee_Ordering_Application.member.mapper;

import com.Coffee_Ordering_Application.member.dto.MemberPatchDto;
import com.Coffee_Ordering_Application.member.dto.MemberPostDto;
import com.Coffee_Ordering_Application.member.dto.MemberResponseDto;
import com.Coffee_Ordering_Application.member.entity.Member;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member memberPostDtoToMember(MemberPostDto memberPostDto);
    Member memberPatchDtoToMember(MemberPatchDto memberPatchDto);
    MemberResponseDto memberToMemberResponseDto(Member member);
    List<MemberResponseDto> membersToMemberResponseDtos(List<Member> members);

}
