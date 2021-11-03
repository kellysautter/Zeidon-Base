//start mUser 2017.09.21 10:10:47
zOPER_EXPORT zSHORT OPERATION
omUser_ActivateUser( zPVIEW vViewToInstance0,
                     zVIEW vViewToSubtask1,
                     zLONG lUserID2 );

zOPER_EXPORT zSHORT OPERATION
omUser_ActivateUserLST( zPVIEW vViewToInstance0,
                        zVIEW vViewToSubtask1 );

zOPER_EXPORT zSHORT OPERATION
omUser_AccessAllowed( zVIEW vViewToInstance0,
                      zPCHAR pchszAdminDiv1,
                      zPCHAR pchszArea2 );

zOPER_EXPORT zSHORT OPERATION
omUser_SectionAccessAllowed( zVIEW vViewToInstance0,
                             zPCHAR pchszAdminDiv1,
                             zPCHAR pchszArea2,
                             zPCHAR pchszSection3,
                             zPCHAR pchszPermissionString4 );

zOPER_EXPORT zSHORT OPERATION
omUser_DocumentAccessAllowed( zVIEW vmUser0,
                              zPCHAR pchszAdminDiv1,
                              zPCHAR pchszArea2 );

zOPER_EXPORT zSHORT OPERATION
omUser_ObjectConstraints( zVIEW vViewtoInstance0,
                          zSHORT nEvent1,
                          zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omUser_SubSectAccessAllowed( zVIEW vViewToInstance0,
                             zPCHAR pchszAdminDiv1,
                             zPCHAR pchszArea2,
                             zPCHAR pchszSection3,
                             zPCHAR pchszSubSectionName4 );

zOPER_EXPORT zSHORT OPERATION
omUser_ValidateEmailValues( zVIEW vViewToInstance0,
                            zPCHAR pchSMTPServer1,
                            zPCHAR pchUserEmailAddress2,
                            zPCHAR pchEmailUserName3,
                            zPCHAR pchEmailPassword4 );

zOPER_EXPORT zSHORT OPERATION
omUser_SecuritySectionPos( zVIEW vViewToInstance0,
                           zVIEW vsAppMgr1 );

//end
//start mPerson 2017.09.21 10:10:11
zOPER_EXPORT zSHORT OPERATION
omPerson_ActivateAllPersonList( zPVIEW vViewToInstance0,
                                zVIEW vViewToWindow1 );

zOPER_EXPORT zSHORT OPERATION
omPerson_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omPerson_ValidateDeletePerson( zVIEW vViewToInstance0 );

//end
//start qFinAidA 2017.03.21 15:35:47
zOPER_EXPORT zSHORT OPERATION
oqFinAidA_GenerateRequirements( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
oqFinAidA_GenerateAwarded( zVIEW vqFinAidS0 );

zOPER_EXPORT zSHORT OPERATION
oqFinAidA_GenerateAwardedFederal( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
oqFinAidA_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start wProspct 2017.03.21 15:36:02
zOPER_EXPORT zSHORT OPERATION
owProspct_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
<<<<<<< HEAD
//start sHost 2017.09.21 10:11:17
zOPER_EXPORT zSHORT OPERATION
osHost_ActivateHostObject( zPVIEW vViewToInstance0,
                           zVIEW vViewToWindow1 );

//end
//start DomainT 2017.09.21 10:07:37
zOPER_EXPORT zSHORT OPERATION
oDomainT_ActivateDomainList( zPVIEW vViewToInstance0,
                             zVIEW vViewToWindow1 );

zOPER_EXPORT zSHORT OPERATION
oDomainT_AcceptDomainValue( zVIEW vViewtoInstance0,
                            zPCHAR pchNameOfEntity1,
                            zSHORT nEvent2,
                            zSHORT nState3 );

//end
//start fChurch 2017.08.07 12:16:45
zOPER_EXPORT zSHORT OPERATION
ofChurch_Constraints( zVIEW vViewtoInstance0,
                      zSHORT nEvent1,
                      zSHORT nState2 );

//end
//start fOrg 2017.03.21 15:33:23
zOPER_EXPORT zSHORT OPERATION
ofOrg_Contraints( zVIEW vViewtoInstance0,
                  zSHORT nEvent1,
                  zSHORT nState2 );

//end
//start fProspct 2017.07.18 09:20:12
zOPER_EXPORT zSHORT OPERATION
ofProspct_CommitConstraint( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

//end
//start fSchool 2017.03.21 15:33:27
zOPER_EXPORT zSHORT OPERATION
ofSchool_Constraints( zVIEW vViewtoInstance0,
                      zSHORT nEvent1,
                      zSHORT nState2 );

//end
//start lCategry 2017.03.21 15:33:31
zOPER_EXPORT zSHORT OPERATION
olCategry_ActivateCategoryLSTFA( zPVIEW vViewToInstance0,
                                 zVIEW vViewToSubtask1,
                                 zPCHAR pchszFunctionalArea2 );

zOPER_EXPORT zSHORT OPERATION
olCategry_ActivateCategoryLST_N( zPVIEW vViewToInstance0,
                                 zVIEW vViewToSubtask1,
                                 zPCHAR pchFunctionalArea2,
                                 zPCHAR pchszName3 );

//end
//start lClassR 2017.03.21 15:33:32
zOPER_EXPORT zSHORT OPERATION
olClassR_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
olClassR_GradeReportFormatGPA( zVIEW vViewToInstance0 );

//end
//start lClsLstC 2017.03.21 15:33:33
zOPER_EXPORT zSHORT OPERATION
olClsLstC_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
olClsLstC_CreateCrossListEntries( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
olClsLstC_BuildClassSeqNumbers( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
olClsLstC_ActivateClassSelectLST( zPVIEW vViewToInstance0,
                                  zVIEW vmStudenC1 );

//end
//start lDegTrkS 2017.03.21 15:33:37
zOPER_EXPORT zSHORT OPERATION
olDegTrkS_ObjectConstraint( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

//end
//start lPersDir 2017.03.21 15:33:42
zOPER_EXPORT zSHORT OPERATION
olPersDir_BuildPersonalData( zVIEW vViewToInstance0,
                             zPCHAR pchInformationType1 );

//end
//start lStuHlth 2017.03.21 15:33:50
zOPER_EXPORT zSHORT OPERATION
olStuHlth_BUILD_ImmunizationReqs( zVIEW vViewToInstance0 );

//end
//start lStuPSch 2017.03.21 15:33:51
zOPER_EXPORT zSHORT OPERATION
olStuPSch_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start lStuSch 2017.03.21 15:33:53
zOPER_EXPORT zSHORT OPERATION
olStuSch_BuildScheduleList( zPVIEW vViewToInstance0,
                            zVIEW vwStudent1 );

zOPER_EXPORT zSHORT OPERATION
olStuSch_BuildStudentSchedule( zVIEW vlStuSch0,
                               zVIEW vwStudent1 );

//end
<<<<<<< HEAD
//start lTrnscpt 2017.03.21 15:33:55
zOPER_EXPORT zSHORT OPERATION
olTrnscpt_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
olTrnscpt_BuildTranscript( zVIEW vViewToInstance0,
                           zPCHAR pchGradUndergradFlag1 );

zOPER_EXPORT zSHORT OPERATION
olTrnscpt_BuildPrintGroup( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
olTrnscpt_UPDATE_GradeFromGS( zVIEW vViewToInstance0 );

//end
//start lUser 2017.09.21 10:09:21
zOPER_EXPORT zSHORT OPERATION
olUser_ObjectConstraints( zVIEW vViewtoInstance0,
                          zSHORT nEvent1,
                          zSHORT nState2 );

//end
//start lUserWeb 2017.03.21 15:33:56
zOPER_EXPORT zSHORT OPERATION
olUserWeb_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start mActTask 2017.03.21 15:33:58
zOPER_EXPORT zSHORT OPERATION
omActTask_GoToTask( zVIEW vViewToInstance0,
                    zVIEW vViewToWindow1,
                    zPCHAR pchLastPageDisplayed2 );

//end
//start mCategry 2017.03.21 15:34:04
zOPER_EXPORT zSHORT OPERATION
omCategry_ActivateCategoryByFA( zPVIEW vViewToInstance0,
                                zVIEW vViewToSubtask1,
                                zPCHAR pchszFunctionalArea2 );

zOPER_EXPORT zSHORT OPERATION
omCategry_ActivateCategoryByName( zPVIEW vViewToInstance0,
                                  zVIEW vViewToSubtask1,
                                  zPCHAR pchFunctionalArea2,
                                  zPCHAR pchszName3 );

//end
//start mChurch 2017.08.07 12:17:12
zOPER_EXPORT zSHORT OPERATION
omChurch_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omChurch_EntityChurchConstraint( zVIEW vViewtoInstance0,
                                 zPCHAR pchNameOfEntity1,
                                 zSHORT nEvent2,
                                 zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
omChurch_BuildAlumRepProspects( zVIEW vViewToInstance0,
                                zVIEW vmAlumRepLST1 );

//end
//start mClass 2017.06.26 11:58:07
zOPER_EXPORT zSHORT OPERATION
omClass_ObjectConstraints( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omClass_ValidateGrade( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omClass_EnrollmentConstraint( zVIEW vViewtoInstance0,
                              zPCHAR pchNameOfEntity1,
                              zSHORT nEvent2,
                              zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
omClass_ValidateClassData( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omClass_RoomSessionConstraint( zVIEW vViewtoInstance0,
                               zPCHAR pchNameOfEntity1,
                               zSHORT nEvent2,
                               zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
omClass_BuildSurveyAnalysis( zVIEW vViewToInstance0,
                             zPVIEW vlClsSurv1,
                             zPCHAR pchType2 );

//end
//start mClassAt 2017.03.21 15:34:10
zOPER_EXPORT zSHORT OPERATION
omClassAt_BuildAttendanceGrid( zVIEW vViewToInstance0,
                               zVIEW vmClass1 );

zOPER_EXPORT zSHORT OPERATION
omClassAt_BuildAttendanceSessns( zVIEW vViewToInstance0,
                                 zVIEW vmClass1 );

zOPER_EXPORT zSHORT OPERATION
omClassAt_ObjectContraints( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omClassAt_CheckAttendanceUpdates( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omClassAt_SetUpAttendanceUpdDspl( zVIEW vViewToInstance0,
                                  zVIEW vmClass1 );

zOPER_EXPORT zSHORT OPERATION
omClassAt_BuildAttendanceGridWeb( zVIEW vViewToInstance0,
                                  zVIEW vmClass1 );

//end
//start mClassGB 2017.03.21 15:34:12
zOPER_EXPORT zSHORT OPERATION
omClassGB_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start mClassSt 2017.04.20 09:53:42
zOPER_EXPORT zSHORT OPERATION
omClassSt_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omClassSt_UPDATE_ClassData( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omClassSt_UPDATE_ClassRanking( zVIEW vViewToInstance0 );

//end
//start mCntHist 2017.03.21 15:34:13
zOPER_EXPORT zSHORT OPERATION
omCntHist_ActivateEventsUser( zPVIEW vViewToInstance0,
                              zVIEW vViewToTask1,
                              zLONG lnUserID2 );

zOPER_EXPORT zSHORT OPERATION
omCntHist_ActivateEventsPerson( zPVIEW vViewToInstance0,
                                zVIEW vViewToTask1,
                                zLONG lnPersonID2 );

zOPER_EXPORT zSHORT OPERATION
omCntHist_CreateImmedActivity( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omCntHist_AddContactActivity( zPVIEW vViewToInstance0,
                              zPCHAR pchszType1,
                              zPCHAR pchszNote2,
                              zVIEW vvSource3,
                              zPCHAR pchszEntityName4,
                              zVIEW vvDocSource5 );

zOPER_EXPORT zSHORT OPERATION
omCntHist_AddContactActivityRec( zPVIEW vViewToInstance0,
                                 zPCHAR pchszType1,
                                 zPCHAR pchzNote2,
                                 zVIEW vvSource3,
                                 zPCHAR pchszEntityName4,
                                 zVIEW vvDocSource5,
                                 zPCHAR pchszRecipientAddresses6 );

zOPER_EXPORT zSHORT OPERATION
omCntHist_AddContactActivityByE( zPVIEW vViewToInstance0,
                                 zPCHAR pchszType1,
                                 zPCHAR pchzNote2,
                                 zVIEW vvSource3,
                                 zPCHAR pchszTargetEntityName4,
                                 zPCHAR pchszSourceEntityName5,
                                 zVIEW vvDocSource6 );

zOPER_EXPORT zSHORT OPERATION
omCntHist_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start mConAltl 2017.03.21 15:34:15
zOPER_EXPORT zSHORT OPERATION
omConAltl_ActivateCreateConListV( zPVIEW vViewToInstance0,
                                  zVIEW vmUser1,
                                  zPCHAR pchszListName2,
                                  zPCHAR pchszFindString3 );

zOPER_EXPORT zSHORT OPERATION
omConAltl_ActivateCreateConListY( zPVIEW vViewToInstance0,
                                  zVIEW vmUser1,
                                  zPCHAR pchszListName2,
                                  zPCHAR pchszFindString3 );

zOPER_EXPORT zSHORT OPERATION
omConAltl_GetConListName( zVIEW vViewToInstance0,
                          zPCHAR pchszMainViewName1,
                          zPCHAR pchszPotentialListName2,
                          zPCHAR pchszReturnString3 );

zOPER_EXPORT zSHORT OPERATION
omConAltl_SetUpDocumentGen( zVIEW vViewToInstance0,
                            zPCHAR pchszEntityName1,
                            zPCHAR pchszObjectName2,
                            zPCHAR pchCL_Flag3 );

zOPER_EXPORT zSHORT OPERATION
omConAltl_SetUpDocumentGenWAFlg( zVIEW vViewToInstance0,
                                 zPCHAR pchszRootEntityName1,
                                 zPCHAR pchszQueryObjectName2,
                                 zPCHAR pchCL_Flag3,
                                 zPCHAR pchActivateFlag4,
                                 zPCHAR pchDocumentType5 );

zOPER_EXPORT zSHORT OPERATION
omConAltl_ActivateConListMainV( zPVIEW vViewToInstance0,
                                zVIEW vViewToWindow1,
                                zLONG lUserID2 );

zOPER_EXPORT zSHORT OPERATION
omConAltl_ActivateConListMainY( zPVIEW vViewToInstance0,
                                zVIEW vViewToWindow1,
                                zLONG lUserID2 );

zOPER_EXPORT zSHORT OPERATION
omConAltl_AddToConListV( zVIEW vmConAltl20,
                         zVIEW vmVendor1,
                         zPCHAR pchszListName2 );

zOPER_EXPORT zSHORT OPERATION
omConAltl_AddToConListY( zVIEW vmConAltl20,
                         zVIEW vmFaculty1,
                         zPCHAR pchszListName2 );

zOPER_EXPORT zSHORT OPERATION
omConAltl_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start mContrac 2017.03.21 15:34:17
zOPER_EXPORT zSHORT OPERATION
omContrac_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start mCourse 2017.03.21 15:34:18
zOPER_EXPORT zSHORT OPERATION
omCourse_ObjectConstraints( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

//end
//start mCPList 2017.03.21 15:34:18
zOPER_EXPORT zSHORT OPERATION
omCPList_ActivateCPList( zPVIEW vViewToInstance0,
                         zVIEW vViewToWindow1,
                         zLONG lPlanID2 );

zOPER_EXPORT zSHORT OPERATION
omCPList_ObjectContraints( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omCPList_AddToNonFolderLists( zVIEW vViewToInstance0,
                              zVIEW vmEvent1 );

zOPER_EXPORT zSHORT OPERATION
omCPList_AddPlanToDirectoryList( zVIEW vViewToInstance0,
                                 zVIEW vSourcePlan1 );

//end
//start mDegTrk 2017.04.27 13:28:23
zOPER_EXPORT zSHORT OPERATION
omDegTrk_AuditStudentCourses( zVIEW vViewToInstance0,
                              zVIEW vmStudent1 );

zOPER_EXPORT zSHORT OPERATION
omDegTrk_ObjectConstraints( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omDegTrk_CombineDegreeTracks( zPVIEW vViewToInstance0,
                              zVIEW vmStudent1 );

//end
//start mDonor 2017.03.21 15:34:23
zOPER_EXPORT zSHORT OPERATION
omDonor_CreateSoftCreditList( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omDonor_CalcDonorTotals( zVIEW vmDonor0 );

zOPER_EXPORT zSHORT OPERATION
omDonor_ObjectConstraints( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omDonor_CreateMatchingOrg( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omDonor_ActivateDonorByID( zPVIEW vViewToInstance0,
                           zVIEW vViewToSubtask1,
                           zLONG lID2 );

//end
//start mDonorSM 2017.03.21 15:34:25
zOPER_EXPORT zSHORT OPERATION
omDonorSM_BuildSummaryByFund( zPVIEW vViewToInstance0,
                              zVIEW vvSubtask1,
                              zLONG lnDonorID2 );

zOPER_EXPORT zSHORT OPERATION
omDonorSM_BuildDonorCYSummary( zVIEW vViewToInstance0 );

//end
//start mEmpFacC 2017.03.21 15:34:25
zOPER_EXPORT zSHORT OPERATION
omEmpFacC_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start mEmploy 2017.07.27 10:45:11
zOPER_EXPORT zSHORT OPERATION
omEmploy_ObjectConstraints( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omEmploy_ValidateDistribValues( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omEmploy_EntityConstraint( zVIEW vViewtoInstance0,
                           zPCHAR pchNameOfEntity1,
                           zSHORT nEvent2,
                           zSHORT nState3 );

//end
//start mFAAdmin 2017.03.21 15:34:30
zOPER_EXPORT zSHORT OPERATION
omFAAdmin_ActivateByEntryYear( zPVIEW vViewToInstance0,
                               zVIEW vmRefView1,
                               zPCHAR pchszYear2,
                               zPCHAR pchszTerm3 );

//end
//start mFaculty 2017.03.21 15:34:32
zOPER_EXPORT zSHORT OPERATION
omFaculty_ObjectConstraint( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

//end
//start mFAProf 2017.04.21 09:30:19
zOPER_EXPORT zSHORT OPERATION
omFAProf_ObjectConstraints( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_CreateFinAidProfile( zPVIEW vViewToInstance0,
                              zVIEW vViewToSubtask1 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_CreateFAProfByFAAdmin( zPVIEW vViewToInstance0,
                                zVIEW vmPerson1,
                                zVIEW vlFAAdmin2 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_CreateFAProfileReus( zPVIEW vViewToInstance0,
                              zVIEW vmPerson1,
                              zVIEW vmFAAdmin2 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_CreateReturningProfile( zVIEW vViewToInstance0,
                                 zLONG lnCollegeYearID1 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_FindFinAidProfile( zPVIEW vViewToInstance0,
                            zVIEW vViewToSubtask1,
                            zPCHAR pchszStudentOrProspect2,
                            zLONG lnID3,
                            zPCHAR pchszYear4 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_AddScholarshipAward( zVIEW vViewToInstance0,
                              zLONG lnSchShipID1,
                              zDECIMAL mdAmount2 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_AddReturningAward( zVIEW vmFAProf0,
                            zLONG lnSrcID1,
                            zDECIMAL mdAwardAmount2 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_ValidateFinAidAward( zVIEW vViewtoInstance0,
                              zPCHAR pchNameOfEntity1,
                              zSHORT nEvent2,
                              zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_CopyProfile( zVIEW vmFAProf0,
                      zPVIEW vmNewFAProf1 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_CreateBefAftEnrolled( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_GenerateAwardsByGroup( zVIEW vmFAProf0 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_GenerateRequirements( zVIEW vViewToInstance0,
                               zSHORT niYearID1 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_ShowHidePeriodAwards( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_AddAwardByAidSource( zVIEW vViewToInstance0,
                              zVIEW vmFASrc1 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_SetFileCompletedDate( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_RemoveFARequirement( zVIEW vmFAProf0,
                              zVIEW vmAdmDiv1 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_BuildFA_LoanForAward( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_Set_FADisbursementData( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_ComputeDisbNetFeeReb( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_SetDisbursementDate( zVIEW vmFAProf0,
                              zVIEW vmFAAdmin1 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_GenNST_Disbursements( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_SetAGS_PeriodClasses( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omFAProf_RoundNST_DisbEntries( zVIEW vViewToInstance0,
                               zDECIMAL mPeriodAmount1,
                               zDECIMAL mTotalDisbursementAmo2 );

//end
//start mFolder 2017.03.21 15:34:37
zOPER_EXPORT zSHORT OPERATION
omFolder_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

//end
//start mGLCAcct 2017.07.12 16:02:17
zOPER_EXPORT zSHORT OPERATION
omGLCAcct_ActivateAccount( zPVIEW vViewToInstance0,
                           zVIEW vzAnyView1,
                           zPCHAR pchAccountNumber2 );

zOPER_EXPORT zSHORT OPERATION
omGLCAcct_CreateAccount( zPVIEW vViewToInstance0,
                         zVIEW vmGLChart1,
                         zPCHAR pchszAccountNumber2,
                         zPCHAR pchszDescription3,
                         zPCHAR pchszType4,
                         zPCHAR pchszGroupOnly5,
                         zLONG lDisplayOrder6 );

zOPER_EXPORT zSHORT OPERATION
omGLCAcct_CreateSubAccount( zPVIEW vViewToInstance0,
                            zVIEW vmGLChart1,
                            zPCHAR pchszAccountNumber2,
                            zPCHAR pchszParentAccountNumbe3,
                            zLONG lnParentAccountID4,
                            zPCHAR pchszDescription5,
                            zPCHAR pchszType6,
                            zLONG lDisplayOrder7 );

//end
//start mGLChart 2017.03.21 15:34:39
zOPER_EXPORT zSHORT OPERATION
omGLChart_CreateChartOfAccounts( zPVIEW vViewToInstance0,
                                 zVIEW vzAnyView1 );

zOPER_EXPORT zSHORT OPERATION
omGLChart_ObjConstraints( zVIEW vViewtoInstance0,
                          zSHORT nEvent1,
                          zSHORT nState2 );

//end
//start mGLCost 2017.03.21 15:34:40
zOPER_EXPORT zSHORT OPERATION
omGLCost_ActivateCostCenter( zPVIEW vViewToInstance0,
                             zVIEW vzView1,
                             zPCHAR pchszCode2 );

zOPER_EXPORT zSHORT OPERATION
omGLCost_CreateCostCenter( zPVIEW vViewToInstance0,
                           zVIEW vzAnyView1,
                           zPCHAR pchszCode2,
                           zLONG lnDeptID3 );

//end
//start mGLFY 2017.03.21 15:34:42
zOPER_EXPORT zSHORT OPERATION
omGLFY_ActivateFiscalYear( zPVIEW vViewToInstance0,
                           zVIEW vzAnyView1,
                           zPCHAR pchszYearString2 );

zOPER_EXPORT zSHORT OPERATION
omGLFY_PeriodValidToPost( zVIEW vmGLFY0,
                          zPCHAR pchszDate1 );

//end
//start mGLJEnt 2017.07.20 12:09:09
zOPER_EXPORT zSHORT OPERATION
omGLJEnt_SAVE_JournalEntry( zVIEW vViewToInstance0,
                            zPCHAR pchCallingOperationName1 );

zOPER_EXPORT zSHORT OPERATION
omGLJEnt_ObjConstraint( zVIEW vViewtoInstance0,
                        zSHORT nEvent1,
                        zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omGLJEnt_CREATE_JournalEntry( zPVIEW vViewToInstance0,
                              zVIEW vzView1,
                              zPCHAR pchszChartEntry2,
                              zPCHAR pchszJournal3,
                              zPCHAR pchszDate4,
                              zPCHAR pchszDescription5,
                              zPCHAR pchszDebitCredit6,
                              zDECIMAL mdAmount7 );

zOPER_EXPORT zSHORT OPERATION
omGLJEnt_CREATE_JERoot( zPVIEW vViewToInstance0,
                        zVIEW vzView1,
                        zPCHAR pchszJournal2,
                        zPCHAR pchszDate3,
                        zPCHAR pchszDescription4 );

zOPER_EXPORT zSHORT OPERATION
omGLJEnt_ADDTO_JournalEntry( zVIEW vViewToInstance0,
                             zPCHAR pchszChartEntry1,
                             zPCHAR pchszDate2,
                             zPCHAR pchszDescription3,
                             zPCHAR pchszDebitCredit4,
                             zDECIMAL mdAmount5 );

zOPER_EXPORT zSHORT OPERATION
omGLJEnt_UPDATE_JournalEntry( zVIEW vmGLJEnt0,
                              zPCHAR pchszChartEntry1,
                              zPCHAR pchszDate2,
                              zPCHAR pchszDescription3,
                              zPCHAR pchszDebitCredit4,
                              zDECIMAL mdAmount5 );

//end
//start mGLRecur 2017.03.21 15:34:43
zOPER_EXPORT zSHORT OPERATION
omGLRecur_ObjConstraint( zVIEW vViewtoInstance0,
                         zSHORT nEvent1,
                         zSHORT nState2 );

//end
//start mHRPos 2017.03.21 15:34:47
zOPER_EXPORT zSHORT OPERATION
omHRPos_ObjectConstraints( zVIEW vmHRPos0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

//end
//start mOrg 2017.03.21 15:34:54
zOPER_EXPORT zSHORT OPERATION
omOrg_ObjectConstraint( zVIEW vViewtoInstance0,
                        zSHORT nEvent1,
                        zSHORT nState2 );

//end
//start mPlan 2017.03.21 15:35:00
zOPER_EXPORT zSHORT OPERATION
omPlan_ActivateSelectEvents( zPVIEW vmPlanList0,
                             zVIEW vAnyView1,
                             zPCHAR pchFunctionalAreaName2 );

//end
//start mProspct 2017.07.27 11:40:42
zOPER_EXPORT zSHORT OPERATION
omProspct_ObjectConstraint( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omProspct_WkRequirementDateSet( zVIEW vViewtoInstance0,
                                zPCHAR pchNameOfEntity1,
                                zSHORT nEvent2,
                                zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
omProspct_AssignTerritoryValues( zVIEW vViewToInstance0,
                                 zVIEW vmAdmDiv1 );

zOPER_EXPORT zSHORT OPERATION
omProspct_GenerateStudentRecord( zVIEW vmProspct0 );

zOPER_EXPORT zSHORT OPERATION
omProspct_SetAutoProspectData( zVIEW vViewToInstance0,
                               zVIEW vmPerson1 );

zOPER_EXPORT zSHORT OPERATION
omProspct_ValidateProspectData( zVIEW vViewToInstance0,
                                zVIEW vmPerson1 );

//end
//start mProspcW 2017.03.21 15:35:04
zOPER_EXPORT zSHORT OPERATION
omProspcW_ObjectContstraints( zVIEW vViewtoInstance0,
                              zSHORT nEvent1,
                              zSHORT nState2 );

//end
//start mRoom 2017.03.21 15:35:06
zOPER_EXPORT zSHORT OPERATION
omRoom_ObjectConstraints( zVIEW vViewtoInstance0,
                          zSHORT nEvent1,
                          zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omRoom_BuildCurrentStudents( zVIEW vViewToInstance0 );

//end
//start mSAChrgT 2017.04.20 13:31:26
zOPER_EXPORT zSHORT OPERATION
omSAChrgT_ObjectConstraint( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omSAChrgT_CreateInternalRule( zPVIEW vViewToInstance0,
                              zVIEW vmSAChrgI1,
                              zPCHAR pchszInternalRuleName2 );

zOPER_EXPORT zSHORT OPERATION
omSAChrgT_ProcessInternalRule( zVIEW vmSAChrgT0,
                               zVIEW vmSAProf1,
                               zPCHAR pchszRefundFlag2 );

zOPER_EXPORT zSHORT OPERATION
omSAChrgT_GenerateChargeEntry( zVIEW vmSAChrgT0,
                               zVIEW vmSAProf1,
                               zDECIMAL mdTotal2 );

zOPER_EXPORT zSHORT OPERATION
omSAChrgT_GenChargeEntryClass( zVIEW vmSAChrgT0,
                               zVIEW vmSAProf1,
                               zDECIMAL mdTotal2 );

zOPER_EXPORT zSHORT OPERATION
omSAChrgT_GenerateRefundEntry( zVIEW vViewToInstance0,
                               zVIEW vmSAProf1 );

zOPER_EXPORT zSHORT OPERATION
omSAChrgT_CreateRefundByDropDate( zVIEW vViewToInstance0,
                                  zVIEW vmSAProf1 );

zOPER_EXPORT zSHORT OPERATION
omSAChrgT_BuildInternalRuleList( zPVIEW vViewToInstance0,
                                 zVIEW vmSAchrgI1 );

zOPER_EXPORT zSHORT OPERATION
omSAChrgT_BuildInternalRuleVar( zPVIEW vViewToInstance0,
                                zVIEW vmSAChrgI1 );

//end
//start mSAClass 2017.03.21 15:35:12
zOPER_EXPORT zSHORT OPERATION
omSAClass_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omSAClass_ActivateClassesByDate( zPVIEW vViewToInstance0,
                                 zVIEW vzAnyView1,
                                 zPCHAR pchszBeginDate2,
                                 zPCHAR pchszEndDate3 );

//end
//start mSAMealP 2017.06.01 13:10:16
zOPER_EXPORT zSHORT OPERATION
omSAMealP_ActivateMPCurrentSA( zPVIEW vViewToInstance0,
                               zVIEW vmYearLST1 );

zOPER_EXPORT zSHORT OPERATION
omSAMealP_ActivateMPAll( zPVIEW vViewToInstance0,
                         zVIEW vzAnyView1 );

//end
//start mSAProf 2017.06.01 13:36:34
zOPER_EXPORT zSHORT OPERATION
omSAProf_BuildCashDiscountTran( zVIEW vmSAProf0 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_DeleteCashDiscountTran( zVIEW vmSAProf0 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_RemoveChargesForTerm( zVIEW vmSAProf0,
                               zLONG lCollegeTermID1 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_ProcessDeletes( zVIEW vmSAProf0 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_ActivateSAProfForYearW( zPVIEW vViewToInstance0,
                                 zVIEW vmSAStu1,
                                 zLONG lnCollegeYearID2,
                                 zLONG lnCollegeTermID3 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_ActivateSAProfForYear( zPVIEW vViewToInstance0,
                                zVIEW vzAnyView1,
                                zLONG lnCollegeYearID2,
                                zLONG lnCollegeTermID3 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_ActivateSAProfForGen( zPVIEW vViewToInstance0,
                               zVIEW vmSAStu1,
                               zLONG lnSAProfileID2,
                               zLONG lnCollegeYearID3,
                               zLONG lnCollegeTermID4 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_SetupSAProfForYear( zVIEW vmSAProf0,
                             zLONG lnCollegeYearID1,
                             zLONG lnCollegeTermID2 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_CreateSA( zPVIEW vViewToInstance0,
                   zVIEW vmSAStu1,
                   zLONG lnCollegeYearID2 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_CreateReturningSAOrig( zVIEW vmSAProfNew0,
                                zVIEW vmSAStu1,
                                zLONG lOldTermID2,
                                zLONG lNewTermID3 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_GenerateCharge( zVIEW vViewToInstance0,
                         zLONG lnTermID1,
                         zLONG lnChargeID2,
                         zDECIMAL mdAmount3,
                         zPCHAR pchszUseDefault4,
                         zPCHAR pchszDesc5 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_GenerateReverseCharge( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_GenerateCharges( zVIEW vmSAProf0,
                          zVIEW vViewToWindow1 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_GenerateUpdateCharge( zVIEW vViewToInstance0,
                               zLONG lnTermID1,
                               zLONG lnChargeID2,
                               zDECIMAL mdAmount3,
                               zPCHAR pchszUseDefault4,
                               zPCHAR pchszDesc5,
                               zPCHAR pchszIncludeClass6 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_LocateCurrentRoom( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_LocateMealPlan( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_CreateReturningSA( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_CheckExistingCharges( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_CreateBillingPeriods( zVIEW vmSAProf0,
                               zLONG lnCollegeYear1 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_UpdateBillingPeriods( zVIEW vmSAProf0,
                               zLONG lnCollegeYear1 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_BuildTermEnrolledTerm( zVIEW vmSAProf0,
                                zLONG lCollegeTermID1 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_ObjectConstraints( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_GenerateSwapTrans( zVIEW vViewToInstance0,
                            zVIEW vmFAProf1,
                            zVIEW vmFAProfOrigAward2,
                            zVIEW vmFASrcAwarded3,
                            zDECIMAL mSwappableAmount4 );

zOPER_EXPORT zSHORT OPERATION
omSAProf_GenerateTuitRemTrans( zVIEW vViewToInstance0,
                               zVIEW vmSAClass1,
                               zVIEW vmEmplTDs2,
                               zDECIMAL mAmount3,
                               zPCHAR pchGenerateEstimatedCos4 );

//end
//start mSAProfE 2017.04.28 15:20:19
zOPER_EXPORT zSHORT OPERATION
omSAProfE_FormatSingleBill( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omSAProfE_PrintPartialStatement( zVIEW vViewToInstance0,
                                 zVIEW vViewToWindow1,
                                 zPCHAR pchBillingFromDate2,
                                 zPCHAR pchBillingToDate3 );

//end
//start mSARuleS 2017.06.01 09:34:11
zOPER_EXPORT zSHORT OPERATION
omSARuleS_BuildDesc( zVIEW vViewToInstance0,
                     zPCHAR pchszString1 );

zOPER_EXPORT zSHORT OPERATION
omSARuleS_TestRuleSet( zVIEW vViewToInstance0,
                       zVIEW vmSAProf1 );

zOPER_EXPORT zSHORT OPERATION
omSARuleS_FindRuleSetValue( zVIEW vmSARuleS0 );

zOPER_EXPORT zSHORT OPERATION
omSARuleS_ApplyRowRule( zVIEW vmSARuleS0 );

zOPER_EXPORT zSHORT OPERATION
omSARuleS_ApplyColumnRule( zVIEW vmSARuleS0 );

zOPER_EXPORT zSHORT OPERATION
omSARuleS_QualifyRuleSet( zVIEW vmSARuleS0,
                          zVIEW vmSAProf1,
                          zVIEW vmPerson2 );

zOPER_EXPORT zSHORT OPERATION
omSARuleS_ApplyRule( zVIEW vmSARuleS0,
                     zVIEW vmSAProf1,
                     zVIEW vmPerson2 );

//end
//start mSAStu 2017.05.15 12:56:23
zOPER_EXPORT zSHORT OPERATION
omSAStu_ObjectConstraints( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omSAStu_CreateSA( zVIEW vViewToInstance0,
                  zLONG lnCollegeYearID1 );

//end
//start mSASubA 2017.03.21 15:35:21
zOPER_EXPORT zSHORT OPERATION
omSASubA_AcceptItem( zVIEW vViewtoInstance0,
                     zPCHAR pchNameOfEntity1,
                     zSHORT nEvent2,
                     zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
omSASubA_ObjectConstraints( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

//end
//start mSATrans 2017.07.19 09:30:37
zOPER_EXPORT zSHORT OPERATION
omSATrans_FindTransForSummary( zPVIEW vViewToInstance0,
                               zVIEW vViewToWindows1,
                               zPCHAR pchszDate2,
                               zPCHAR pchszJournal3,
                               zPCHAR pchszResultName4 );

zOPER_EXPORT zSHORT OPERATION
omSATrans_FindTransForDeposit( zPVIEW vViewToInstance0,
                               zVIEW vViewToWindow1,
                               zPCHAR pchszDate2,
                               zPCHAR pchszDate23,
                               zPCHAR pchszJournal4,
                               zPCHAR pchszResultName5 );

zOPER_EXPORT zSHORT OPERATION
omSATrans_SummerizeSATrans( zVIEW vViewToInstance0,
                            zVIEW vViewToWindow1,
                            zPCHAR pchszDate2,
                            zPCHAR pchszJournalCode3 );

zOPER_EXPORT zSHORT OPERATION
omSATrans_BookStudentTrans( zVIEW vmSATransLST0,
                            zPCHAR pchszDate1 );

//end
//start mSchool 2017.03.21 15:35:25
zOPER_EXPORT zSHORT OPERATION
omSchool_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

//end
//start mSchoolT 2017.03.21 15:35:25
zOPER_EXPORT zSHORT OPERATION
omSchoolT_ACCEPT_ForeignCourse( zVIEW vViewtoInstance0,
                                zPCHAR pchNameOfEntity1,
                                zSHORT nEvent2,
                                zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
omSchoolT_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start mStuAcdS 2017.03.21 15:35:26
zOPER_EXPORT zSHORT OPERATION
omStuAcdS_BuildAcademicEntry( zVIEW vViewToInstance0,
                              zVIEW vlTrnscpt1,
                              zVIEW vRESULT2,
                              zPCHAR pchszReplaceCurrentEntr3 );

//end
//start mStudenC 2017.05.30 11:02:11
zOPER_EXPORT zSHORT OPERATION
omStudenC_BuildStuClassHistory( zVIEW vViewToInstance0,
                                zVIEW vlTrnscpt1,
                                zPCHAR pchCollegeType2 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_BuildClassScheduleAttr( zVIEW vViewToInstance0,
                                  zPCHAR pchszMeetingSchedule1,
                                  zPCHAR pchszRegistrationEntity2 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_FindPrerequisiteClass( zVIEW vViewToInstance0,
                                 zPCHAR pchszPrerequisiteCourse1,
                                 zPCHAR pchszPrerequisiteYearSe2 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_FindCorequisiteClass( zVIEW vViewToInstance0,
                                zPCHAR pchszPrerequisiteCourse1 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_CLEAR_Errors( zVIEW vmStudenC0 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_FORMAT_Errors( zVIEW vmStudenC0 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_ValidateAddedCourse( zVIEW vmStudenC0,
                               zVIEW vlClsLstC1 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_BuildCurrentSchedule( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_ValidateAddedCourses( zVIEW vmStudenC0,
                                zVIEW vlClsLstC1 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_SaveAcademicObject( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_BuildRegistrationEntry( zVIEW vViewToInstance0,
                                  zPCHAR pchszRegistrationEntity1 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_UpdateScheduleEntries( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_RerankDeletedWaitlists( zVIEW vmStudenC0 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_OrderRegistrationRecs( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_US_Registration( zVIEW vViewtoInstance0,
                           zPCHAR pchNameOfEntity1,
                           zSHORT nEvent2,
                           zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_BuildUS_RegEntries( zVIEW vViewToInstance0,
                              zLONG lCollegeTermID1 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_DeleteRegisEntry( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_ValidateTermSchedules( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_ValidateClassSchedule( zVIEW vViewToInstance0,
                                 zVIEW vlClsLstC1 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_ValidateClassScheduleR( zVIEW vmStudenC0,
                                  zVIEW vlClsLstC1 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_AcceptHS_Course( zVIEW vViewtoInstance0,
                           zPCHAR pchNameOfEntity1,
                           zSHORT nEvent2,
                           zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_GenerateHS_ReqGroups( zVIEW vViewToInstance0,
                                zPCHAR pchStudentTestingStatus1 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_ValidateAddedCourseR( zVIEW vViewToInstance0,
                                zVIEW vlClsLstC1,
                                zPCHAR pchPreReqsNotMetFlag2 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_AddClassToStudentSched( zVIEW vViewToInstance0,
                                  zVIEW vlClsLstC1,
                                  zPCHAR pchStudentNameMsg2 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_SaveStudentSchedule( zVIEW vViewToInstance0,
                               zVIEW vViewToWindow1 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_BuildUS_RegTotals( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omStudenC_TieAS_ClassesToFAProfs( zVIEW vViewToInstance0 );

//end
<<<<<<< HEAD
//start mStudent 2017.08.16 14:10:25
zOPER_EXPORT zSHORT OPERATION
omStudent_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omStudent_BuildMajorGPA_Report( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omStudent_BuildGradInfoRels( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omStudent_WkRequirementDataSet( zVIEW vViewtoInstance0,
                                zPCHAR pchNameOfEntity1,
                                zSHORT nEvent2,
                                zSHORT nState3 );

//end
//start mStuPSch 2017.08.07 08:52:14
zOPER_EXPORT zSHORT OPERATION
omStuPSch_RemoveFromProposedSchd( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omStuPSch_BuildPropSchedDisplay( zVIEW vViewToInstance0,
                                 zVIEW vmStudenC1 );

zOPER_EXPORT zSHORT OPERATION
omStuPSch_BuildUpdateSchedule( zVIEW vViewToInstance0,
                               zVIEW vlClsLstC1,
                               zVIEW vmStudenC2 );

zOPER_EXPORT zSHORT OPERATION
omStuPSch_CreatePropEnrollment( zVIEW vViewToInstance0,
                                zVIEW vlClsLstC1,
                                zVIEW vmStudenC2 );

zOPER_EXPORT zSHORT OPERATION
omStuPSch_EmailScheduleStatus( zVIEW vViewToInstance0,
                               zVIEW vViewToWIndow1,
                               zPCHAR pchszStatus2,
                               zPCHAR pchszFaculty3,
                               zSHORT nFacultyID4 );

zOPER_EXPORT zSHORT OPERATION
omStuPSch_PreRegistrationInit( zVIEW vViewToInstance0,
                               zVIEW vwStudent1,
                               zPCHAR pchApprovalStatus2 );

zOPER_EXPORT zSHORT OPERATION
omStuPSch_SetFacultyApprStatus( zVIEW vViewToInstance0,
                                zPCHAR pchszApprovalStatus1,
                                zSHORT nFacultyID2 );

zOPER_EXPORT zSHORT OPERATION
omStuPSch_ResetApprovalStatus( zVIEW vmStuPSch0 );

zOPER_EXPORT zSHORT OPERATION
omStuPSch_UpdateRegUsingProp( zVIEW vViewToInstance0,
                              zVIEW vmStudenC1,
                              zVIEW vTermslClsLstC2 );

//end
//start mTerm 2017.03.21 15:35:39
zOPER_EXPORT zSHORT OPERATION
omTerm_ObjectConstraints( zVIEW vViewtoInstance0,
                          zSHORT nEvent1,
                          zSHORT nState2 );

//end
//start mTermFEA 2017.03.21 15:35:40
zOPER_EXPORT zSHORT OPERATION
omTermFEA_BuildFinalExamAnalysis( zVIEW vViewToInstance0,
                                  zVIEW vmTermFES1 );

//end
//start mTransfr 2017.04.27 12:49:48
zOPER_EXPORT zSHORT OPERATION
omTransfr_AcceptTransferReg( zVIEW vViewtoInstance0,
                             zPCHAR pchNameOfEntity1,
                             zSHORT nEvent2,
                             zSHORT nState3 );

//end
//start qPerson 2017.03.21 15:35:49
zOPER_EXPORT zSHORT OPERATION
oqPerson_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

//end
//start qProspct 2017.07.18 09:22:57
zOPER_EXPORT zSHORT OPERATION
oqProspct_GenerateRequirements( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
oqProspct_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
oqProspct_GenerateFARequirements( zVIEW vqProspct0 );

zOPER_EXPORT zSHORT OPERATION
oqProspct_GenerateAwarded( zVIEW vViewToInstance0 );

//end
//start qTransfr 2017.03.21 15:35:55
zOPER_EXPORT zSHORT OPERATION
oqTransfr_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start sAppMgr 2017.09.21 10:11:03
zOPER_EXPORT zSHORT OPERATION
osAppMgr_RestoreLastViews( zVIEW vsAppMgr0 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_CreateGeneralTask( zVIEW vsAppMgr0,
                            zPCHAR pchGeneralMenuName1,
                            zPCHAR pchGeneralName2 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_DeleteGeneralTask( zVIEW vsAppMgr0,
                            zPCHAR pchGeneralName1 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_CreateFunctionalAreas( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_AddSplitWindow( zVIEW vViewToInstance0,
                         zPCHAR pchFunctionalArea1,
                         zPCHAR pchFunctionalSubArea2,
                         zPCHAR pchWindowName3,
                         zPCHAR pchHasFrame4,
                         zVIEW vViewToWindow5 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_IsSplitWindowAdded( zVIEW vsAppMgr0,
                             zPCHAR pchszFunctionalArea1,
                             zPCHAR pchszFunctionalSubArea2,
                             zPCHAR pchszWindowName3 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_CloseSplitWindow( zVIEW vViewToInstance0,
                           zPCHAR pchszFunctionalArea1,
                           zPCHAR pchszFunctionalSubArea2,
                           zPCHAR pchszWindowName3 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_DetatchWindow( zVIEW vViewToInstance0,
                        zPCHAR pchszFunctionalArea1,
                        zPCHAR pchszFunctionalSubArea2,
                        zPCHAR pchszWindowName3 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_CloseAllSplitWindows( zVIEW vViewToInstance0,
                               zPCHAR pchszDialogName1,
                               zPCHAR pchszFunctionalArea2 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_GetActiveSplitWindow( zVIEW vViewToInstance0,
                               zPVIEW vvWindow1,
                               zPCHAR pchFunctionalArea2,
                               zPCHAR pchFunctionalSubArea3 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_RefreshSplitWindow( zVIEW vViewToInstance0,
                             zPCHAR pchszFunctionalArea1,
                             zPCHAR pchszFunctionalSubArea2,
                             zPCHAR pchszWindowName3 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_RefreshAllSplitWindows( zVIEW vsAppMgr0,
                                 zPCHAR pchszFunctionalArea1,
                                 zPCHAR pchszFunctionalSubArea2 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_MapAllSplitWindows( zVIEW vsAppMgr0,
                             zPCHAR pchszFunctionalArea1,
                             zPCHAR pchszFunctionalSubArea2 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_MapSplitWindow( zVIEW vViewToInstance0,
                         zPCHAR pchszFunctionalArea1,
                         zPCHAR pchszFunctionalSubArea2,
                         zPCHAR pchszWindowName3 );

zOPER_EXPORT zSHORT OPERATION
osAppMgr_SaveLastViews( zVIEW vsAppMgr0 );

//end
//start wFXferO 2017.03.21 15:35:59
zOPER_EXPORT zSHORT OPERATION
owFXferO_CalcAPValues( zVIEW vViewToInstance0 );

//end
//start wStudent 2017.05.23 17:27:13
zOPER_EXPORT zSHORT OPERATION
owStudent_BuildScheduleList( zVIEW vViewToInstance0,
                             zVIEW vlClsLstC1 );

zOPER_EXPORT zSHORT OPERATION
owStudent_BuildClassListForTerm( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
owStudent_BuildClassListForAudit( zVIEW vViewToInstance0,
                                  zVIEW vlClsLstC1,
                                  zVIEW vmStudent2,
                                  zVIEW vmStudenC3 );

zOPER_EXPORT zSHORT OPERATION
owStudent_BuildStandardSchedule( zVIEW vViewToInstance0,
                                 zVIEW vmCRStdPLST1,
                                 zVIEW vlClsLstC2 );

//end
//start wXferO 2017.09.21 10:11:48
zOPER_EXPORT zSHORT OPERATION
owXferO_SetUpAllQueryValues( zVIEW vViewToInstance0 );

//end
//start zqSQuery 2017.05.18 13:50:50
zOPER_EXPORT zSHORT OPERATION
ozqSQuery_ObjectConstraint( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
ozqSQuery_ResyncQueryToReport( zVIEW vViewToInstance0 );

//end
//start lURunRpt 2016.06.21 14:08:41
zOPER_EXPORT zSHORT OPERATION
olURunRpt_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start zqFrame 2017.03.21 15:36:07
zOPER_EXPORT zSHORT OPERATION
ozqFrame_BuildQualFromFrame( zVIEW vViewToInstance0,
                             zPVIEW vKZDBHQUA1,
                             zVIEW vqConvertData2 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_FormatCSV_TitleRecurs( zVIEW vViewToInstance0,
                                zVIEW vzqFrameRoot1,
                                zPCHAR pchOutputLine2,
                                zPLONG lNextColumnNumber3,
                                zPCHAR pchszTypeFlag4,
                                zLONG lRecursiveLevel5 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_ClearQueryInformation( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_BuildQualEntry( zVIEW vViewToInstance0,
                         zPCHAR pchEntityName1,
                         zPCHAR pchAttributeName2,
                         zPCHAR pchSearchType3,
                         zPCHAR pchSearchValue4,
                         zVIEW vqConvertData5,
                         zVIEW vKZDBHQUA6 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_CheckSubgroupSelection( zVIEW vViewToInstance0,
                                 zVIEW vQueryObject1,
                                 zPCHAR pchQualifyingEntityName2,
                                 zPCHAR pchRootEntityFlag3 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_ValidateQuery( zVIEW vViewToInstance0,
                        zPCHAR pchType1 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_FormatCSV_EntityRecurs( zVIEW vViewToInstance0,
                                 zVIEW vzqFrameRoot1,
                                 zVIEW vvQueryObject2,
                                 zPCHAR pchOutputLine3,
                                 zPCHAR pchszType4,
                                 zLONG lFilePointer5,
                                 zPLONG lHierarchicalLevel6,
                                 zPLONG lLastLevel7,
                                 zPCHAR pchScopingEntityName8 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_InitializeFrameForLOD( zPVIEW vViewToInstance0,
                                zVIEW vvLOD1 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_InitializeFrameRecurs( zVIEW vViewToInstance0,
                                zVIEW vzqFrameRoot1,
                                zVIEW vvLOD_Recurs2,
                                zVIEW vvLOD_Root3,
                                zPCHAR pchParentEntityName4,
                                zPCHAR pchRootEntityName5 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_RebuildObjEntRecurs( zVIEW vzqFrame0,
                              zVIEW vzqFrameRoot1,
                              zVIEW vvLOD_Recurs2,
                              zVIEW vvLOD_Root3,
                              zPCHAR pchParentEntityName4,
                              zPCHAR pchRootEntityName5 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_FormatDisplay( zVIEW vViewToInstance0,
                        zVIEW vvXOD1 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_FormatDisplayRecur( zVIEW vViewToInstance0,
                             zVIEW vqFrameRoot1,
                             zVIEW vvXOD2 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_ComputeOperationValue( zVIEW vViewToInstance0,
                                zVIEW vvQueryObject1,
                                zPDECIMAL mReturnedValue2,
                                zPCHAR pchOperation3,
                                zPCHAR pchEntityName4,
                                zPCHAR pchAttributeName5,
                                zPCHAR pchScopingEntityName6 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_ActivateQueryObject( zVIEW vViewToInstance0,
                              zPVIEW vvResultSet1 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_AnalyzeReformatResult( zVIEW vzqFrame0,
                                zVIEW vvResultSet1 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_PostActivateProc( zVIEW vViewToInstance0,
                           zVIEW vvResultSet1 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_FormatCSV_FrmResultSet( zVIEW vViewToInstance0,
                                 zVIEW vvXOD1,
                                 zVIEW vvResultSet2,
                                 zPCHAR pchszType3,
                                 zPCHAR pchOutputFileName4 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_ComputeOperationVDate( zVIEW vViewToInstance0,
                                zVIEW vvQueryObject1,
                                zPCHAR pchReturnedValue2,
                                zPCHAR pchOperationName3,
                                zPCHAR pchszEntityName4,
                                zPCHAR pchszAttributeName5,
                                zPCHAR pchScopingEntityName6 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_FormatCSV_StartLine( zVIEW vViewToInstance0,
                              zPCHAR pchOutputLine1,
                              zLONG lNextColumnCount2,
                              zPCHAR pchFormatCSV_StartLine3 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_FormatRptDesign( zVIEW vViewToInstance0,
                          zVIEW vvXOD1,
                          zPVIEW vqBaseR_Return2,
                          zPCHAR pchReportTitle3,
                          zPCHAR pchQueryViewName4 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_FormatRptDesignRecurs( zVIEW vViewToInstance0,
                                zVIEW vqFrameRoot1,
                                zVIEW vqBaseR2,
                                zVIEW vqBaseR_Source3,
                                zPCHAR pchQueryViewName4,
                                zLONG lFirstColumnStartingPosi5,
                                zPCHAR pchParentDisplayRowFlag6 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_PostActivateRecurs( zVIEW vViewToInstance0,
                             zVIEW vzqFrameRoot1,
                             zVIEW vvQueryObject2 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_ExpandGeneralParms( zVIEW vViewToInstance0,
                             zVIEW vQueryFrame1 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_LocateEntityRecurs( zVIEW vViewToInstance0,
                             zPCHAR pchEntityName1 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_SetUpOrderingInfo( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_OrderRequestedEntity( zVIEW vViewToInstance0,
                               zVIEW vQueryObject1,
                               zPCHAR pchszEntityName2 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_MergeResultSets( zVIEW vViewToInstance0,
                          zVIEW vResultSetTarget1,
                          zVIEW vResultSetSource2,
                          zPCHAR pchszEntityName3 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_BuildPostQualEntry( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_FormatResultSetList( zVIEW vViewToInstance0,
                              zVIEW vResultSet1,
                              zVIEW vViewToWindow2,
                              zPCHAR pchListboxTag3 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_BuildConditionValues( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
ozqFrame_ResyncObjectNames( zVIEW vViewToInstance0,
                            zVIEW vvLOD1,
                            zPCHAR pchszLanguageCode2 );

//end
//start mGLBdEnt 2016.06.21 14:04:18
zOPER_EXPORT zSHORT OPERATION
omGLBdEnt_DistributeBudgetEvenly( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omGLBdEnt_DistributeBudgetPrior( zVIEW vmGLBdEnt0,
                                 zVIEW vmGLBdEntPrior1 );

zOPER_EXPORT zSHORT OPERATION
omGLBdEnt_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start mAPBillV 2017.03.21 15:34:00
zOPER_EXPORT zSHORT OPERATION
omAPBillV_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start mRptStru 2016.06.21 14:05:55
zOPER_EXPORT zSHORT OPERATION
omRptStru_CREATE_FlatGroupReus( zVIEW vViewToInstance0,
                                zVIEW vmRptStruRoot1 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_BuildInteractiveReport( zVIEW vViewToInstance0,
                                  zPCHAR pchBeginDate1,
                                  zPCHAR pchEndDate2,
                                  zLONG llFiscalYearID3,
                                  zLONG lBudgetReportPeriod4 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_BuildBudgetAnalysisStr( zVIEW vmRptStru0,
                                  zPCHAR pchszBeginDate1,
                                  zPCHAR pchszEndDate2,
                                  zLONG llFiscalYearID3,
                                  zLONG lBudgetReportPeriod4 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_BuildBudgetAnalysisR( zVIEW vmRptStru0 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_BuildInteractiveRptRes( zVIEW vViewToInstance0,
                                  zPCHAR pchszBeginDate1,
                                  zPCHAR pchszEndDate2,
                                  zLONG llFiscalYearID3,
                                  zLONG lBudgetReportPeriod4,
                                  zPCHAR pchszReportType5 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_AccumulateYTD_Totals( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_BuildCC_CostCenters( zVIEW vViewToInstance0,
                               zVIEW vRootView1,
                               zPLONG llCostCenterCount2 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_BuildPrintGroupRecurs( zVIEW vViewToInstance0,
                                 zVIEW vmRptStruRoot1,
                                 zLONG llLevel2 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_MergePriorSrcToTgt( zVIEW vSourceRS0,
                              zVIEW vTargetRS1 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_MergePriorCCsToTgt( zVIEW vSourceRS0,
                              zVIEW vTargetRS1 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_MergePriorAcctsToTgt( zVIEW vSourceRS0,
                                zVIEW vTargetRS1 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_CopySubsFromGrpToGrp( zVIEW vSourceRS0,
                                zVIEW vTargetRS1 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_CopyCCsFromGrpToGrp( zVIEW vSourceRS0,
                               zVIEW vTargetRS1 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_CopyAccountsFromCCToCC( zVIEW vSourceRS0,
                                  zVIEW vTargetRS1 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_DuplicateExpRevLines( zVIEW vmRptStru0,
                                zVIEW vmRptStruRoot1 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_DuplicateSetExpRevCCs( zVIEW vSourceRS0 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_MergeNextSrcToTgt( zVIEW vSourceRS0,
                             zVIEW vTargetRS1 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_MergeNextCCsToTgt( zVIEW vSourceRS0,
                             zVIEW vTargetRS1 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_MergeNextAcctsToTgt( zVIEW vSourceRS0,
                               zVIEW vTargetRS1 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_RemoveNonmatchAcctsCCs( zVIEW vTargetRS0 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_BuildDisplayEntsRecurs( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_BuildBudgetOnlyReport( zVIEW vViewToInstance0,
                                 zVIEW vmRptStruTot1,
                                 zVIEW vmGLBudgt2,
                                 zPCHAR pchszTotSetAttributeNam3 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_BuildBudgetOnlyTotR( zVIEW vViewToInstance0,
                               zVIEW vmRptStruTot1,
                               zPCHAR pchszSetExpenseAttribut2,
                               zPCHAR pchszSetRevenueAttribut3 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_BuildBudgetFlatView( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omRptStru_BuildBudgetFlatViewR( zVIEW vmRptStruRoot0,
                                zVIEW vmRptStruR1 );

//end
//start mUserPC 2016.06.21 14:06:14
zOPER_EXPORT zSHORT OPERATION
omUserPC_GenerateApprovalCCs( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omUserPC_GenerateApprovalCCsR( zVIEW vViewToInstance0,
                               zVIEW vmUserPCRoot1 );

//end
<<<<<<< HEAD
//start ZGLOBAL1 2017.08.30 13:43:26
zOPER_EXPORT zSHORT OPERATION
ConvertLineToEntity( zVIEW vEntityView0,
                     zVIEW vXOD_View1,
                     zPCHAR pchRecordArea2,
                     zPCHAR pchDelimiterType3,
                     zLONG lMaxRecordLth4 );

zOPER_EXPORT zVOID OPERATION
DELETE_File( zPCHAR pchFileName0 );

zOPER_EXPORT zDECIMAL OPERATION
IntToDecimal( zLONG lIntStr0 );

zOPER_EXPORT zLONG OPERATION
DecimalToInt( zDECIMAL mintStr0 );

zOPER_EXPORT zSHORT OPERATION
strIsInteger( zPCHAR pchStringIn0 );

zOPER_EXPORT zSHORT OPERATION
strIsNumber( zPCHAR pchStringIn0 );

zOPER_EXPORT zSHORT OPERATION
strUpper( zPCHAR pchStringInOut0 );

zOPER_EXPORT zSHORT OPERATION
ValidateEmailAddress( zPCHAR pchemailAddress0 );

zOPER_EXPORT zSHORT OPERATION
ReturnFileNameFromPath( zPCHAR pchReturnedFileName0,
                        zPCHAR pchFileName1 );

zOPER_EXPORT zSHORT OPERATION
ConvertDecimalToString( zDECIMAL mDecimalValue0,
                        zPCHAR pchStringValue1,
                        zLONG lDecimalPositions2 );

zOPER_EXPORT zSHORT OPERATION
IsNumber( zPCHAR pchStr0 );

zOPER_EXPORT zSHORT OPERATION
strSubstringCompareIgnoreCase( zPCHAR pchMainString0,
                               zPCHAR pchSubString1 );

zOPER_EXPORT zSHORT OPERATION
strLen( zPCHAR pchStringIn0 );

zOPER_EXPORT zSHORT OPERATION
PRINT_ExcelReport_Jasper( zVIEW vViewToWindow0 );

zOPER_EXPORT zSHORT OPERATION
strLower( zPCHAR pchStringInOut0 );

zOPER_EXPORT zSHORT OPERATION
strFirstWord( zPCHAR pchStringInOut0 );

zOPER_EXPORT zSHORT OPERATION
strLeft( zPCHAR pchStringInOut0,
         zLONG lretval1 );

zOPER_EXPORT zSHORT OPERATION
SendEmail( zVIEW vsHost0,
           zPCHAR pchSenderEmail1,
           zPCHAR pchRecipientEmail2,
           zPCHAR pchSubjectLine3,
           zPCHAR pchBodyMsg4,
           zPCHAR pchAttachmentFileName5 );

zOPER_EXPORT zSHORT OPERATION
CheckPassword( zPCHAR pchPassword0 );

zOPER_EXPORT zVOID OPERATION
CallJasperReport( zVIEW vViewtoObject0,
                  zPCHAR pchRptName1 );

zOPER_EXPORT zLONG OPERATION
CheckPasswordInternal( zVIEW vViewToWindow0,
                       zPCHAR pchUsername1,
                       zPCHAR pchEnteredPassword2 );

zOPER_EXPORT zLONG OPERATION
GetPasswordHash( zVIEW vViewToWindow0,
                 zPCHAR pchInputString1,
                 zPCHAR pchHashedString2,
                 zPCHAR pchSaltVal3 );

zOPER_EXPORT zLONG OPERATION
GetHexHash( zPCHAR pchInputString0,
            zPCHAR pchHashedString1,
            zPCHAR pchHashType2 );

zOPER_EXPORT zSHORT OPERATION
ConvertXML_SpecialCharacters( zVIEW vAnyView0,
                              zPCHAR pchReturnedString1,
                              zPCHAR pchSourceString2,
                              zLONG lReturnedStringLength3 );

zOPER_EXPORT zSHORT OPERATION
ConvertTabStringToEntity( zVIEW vEntityView0,
                          zPCHAR pchszEntityName1,
                          zPCHAR pchRecordArea2,
                          zLONG lMaxRecordLth3 );

zOPER_EXPORT zSHORT OPERATION
AD_SetUserProperty( zPCHAR pchAD_Pathname0,
                    zPCHAR pchAD_AdminName1,
                    zPCHAR pchAD_AdminPassword2,
                    zPCHAR pchAD_UserName3,
                    zPCHAR pchAD_PropertyName4,
                    zPCHAR pchAD_PropertyValue5 );

zOPER_EXPORT zSHORT OPERATION
SetAttributeFromUC_Attribute( zVIEW vTargetView0,
                              zPCHAR pchTargetEntityName1,
                              zPCHAR pchTargetAttributeName2,
                              zVIEW vSourceView3,
                              zPCHAR pchSourceEntityName4,
                              zPCHAR pchSourceAttributeName5 );

zOPER_EXPORT zSHORT OPERATION
SetAttributeFromUC_String( zVIEW vvView0,
                           zPCHAR pchEntityName1,
                           zPCHAR pchAttributeName2,
                           zPCHAR pchSourceString3 );

zOPER_EXPORT zSHORT OPERATION
SetStringUpperLowerCase( zPCHAR pchStringToConvert0 );

zOPER_EXPORT zSHORT OPERATION
ValidateAndSetState( zVIEW vAnyView0,
                     zPCHAR pchszEntityName1,
                     zPCHAR pchszAttributeName2,
                     zPCHAR pchStateString3 );

zOPER_EXPORT zSHORT OPERATION
AD_GetUserProperty( zPCHAR pchAD_Pathname0,
                    zPCHAR pchAD_UserName1,
                    zPCHAR pchAD_Password2,
                    zPCHAR pchAD_Property3,
                    zPCHAR pchReturnProperty4 );

zOPER_EXPORT zSHORT OPERATION
AD_RemoveUser( zPCHAR pchAD_Pathname0,
               zPCHAR pchAD_UserName1,
               zPCHAR pchAD_UserPassword2 );

zOPER_EXPORT zSHORT OPERATION
AD_AddNewUser( zPCHAR pchAD_Pathname0,
               zPCHAR pchAD_LoginUserName1,
               zPCHAR pchAD_LoginPassword2,
               zPCHAR pchAD_NewUserName3,
               zPCHAR pchAD_NewUserPassword4 );

zOPER_EXPORT zSHORT OPERATION
AD_SetPassword( zPCHAR pchAD_Pathname0,
                zPCHAR pchAD_LoginUserName1,
                zPCHAR pchAD_LoginPassword2,
                zPCHAR pchAD_UserName3,
                zPCHAR pchAD_Password4 );

zOPER_EXPORT zSHORT OPERATION
AD_ChangePassword( zPCHAR pchAD_Pathname0,
                   zPCHAR pchAD_LoginUserName1,
                   zPCHAR pchAD_LoginPassword2,
                   zPCHAR pchAD_UserName3,
                   zPCHAR pchAD_OldPassword4,
                   zPCHAR pchAD_NewPassword5 );

zOPER_EXPORT zSHORT OPERATION
AD_RemoveUserPassword( zPCHAR pchServerName0,
                       zPCHAR pchServerPort1,
                       zPCHAR pchOrganization2,
                       zPCHAR pchUserName3 );

zOPER_EXPORT zSHORT OPERATION
AD_AddUserPassword( zPCHAR pchServerName0,
                    zPCHAR pchServerPort1,
                    zPCHAR pchOrganization2,
                    zPCHAR pchUserName3,
                    zPCHAR pchUserPassword4 );

zOPER_EXPORT zSHORT OPERATION
AD_AuthenticateUserPassword( zPCHAR pchszAD_Pathname0,
                             zPCHAR pchAD_UserName1,
                             zPCHAR pchAD_Password2 );

zOPER_EXPORT zSHORT OPERATION
SendEmailForFilesWithCC( zVIEW vAnyView0,
                         zVIEW vResultSet1,
                         zPCHAR pchpchSMTPServer2,
                         zPCHAR pchpchRecipientEmailAdd3,
                         zPCHAR pchpchSenderEMailAddres4,
                         zPCHAR pchpchCC_EMailAddress5,
                         zPCHAR pchpchBCC_EMailAddress6,
                         zPCHAR pchpchEMailUserName7,
                         zPCHAR pchpchEMailPassword8,
                         zPCHAR pchpchSubjectLine9,
                         zPCHAR pchpchBodyFileName10,
                         zPCHAR pchAlternateTextFileNam11,
                         zPCHAR pchEmbeddedImagesList12,
                         zPCHAR pchpchAttachmentFileNam13,
                         zSHORT nnMimeType14,
                         zLONG llConnection15 );

zOPER_EXPORT zSHORT OPERATION
CheckForTableAttribute( zVIEW vObjectView0,
                        zPCHAR pchEntityName1,
                        zPCHAR pchAttributeName2,
                        zPCHAR pchObjectName3 );

zOPER_EXPORT zSHORT OPERATION
RemoveLeadingZerosFromAttrib( zVIEW vzView0,
                              zPCHAR pchszEntityName1,
                              zPCHAR pchszAttributeName2 );

zOPER_EXPORT zSHORT OPERATION
SetEntityCursorByInteger( zVIEW vzView0,
                          zPCHAR pchszEntityName1,
                          zPCHAR pchszAttributeName2,
                          zLONG llControlValue3,
                          zLONG lIntegerSearchValue4,
                          zPCHAR pchScopingEntityName5 );

zOPER_EXPORT zSHORT OPERATION
ConvertISIR_NumberToAttribute( zVIEW vTargetView0,
                               zPCHAR pchTargetEntityName1,
                               zPCHAR pchTargetAttributeName2,
                               zPCHAR pchISIR_Value3 );

zOPER_EXPORT zSHORT OPERATION
FTPSendFile( zVIEW vvSubTask0,
             zPCHAR pchszServerAddress1,
             zPCHAR pchszUserName2,
             zPCHAR pchszPassword3,
             zPCHAR pchszLocalFileName4,
             zPCHAR pchszServerFileName5,
             zLONG llControl6 );

zOPER_EXPORT zSHORT OPERATION
WL_QC( zLONG lFileHandle0,
       zPCHAR pchBuffer1,
       zPCHAR pchTransChar2,
       zSHORT nNrAppendedBlankLines3 );

zOPER_EXPORT zSHORT OPERATION
SendEmailForFiles( zVIEW vViewToWindow0,
                   zVIEW vResultSet1,
                   zPCHAR pchpchSMTPServer2,
                   zPCHAR pchpchRecipientEmailAdd3,
                   zPCHAR pchpchSenderEMailAddres4,
                   zPCHAR pchpchEMailUserName5,
                   zPCHAR pchpchEMailPassword6,
                   zPCHAR pchpchSubjectLine7,
                   zPCHAR pchpchBodyFileName8,
                   zPCHAR pchAlternateTextFileNam9,
                   zPCHAR pchEmbeddedImagesList10,
                   zPCHAR pchpchAttachmentFileNam11,
                   zSHORT nnMimeType12,
                   zLONG llConnection13 );

zOPER_EXPORT zSHORT OPERATION
ReturnSuffixOfFileName( zPCHAR pchReturnedSuffix0,
                        zPCHAR pchFileName1 );

zOPER_EXPORT zSHORT OPERATION
GetRTFPath( zVIEW vViewToSubTask0,
            zLONG lFlags1,
            zPCHAR pchszTargetPath2 );

zOPER_EXPORT zSHORT OPERATION
ParseBooleanExpression( zVIEW vzqFrame0 );

zOPER_EXPORT zSHORT OPERATION
WinShellExecute( zVIEW vViewSubTask0,
                 zPCHAR pchszFileOrExeName1,
                 zPCHAR pchszFileOpenCommand2,
                 zPCHAR pchszExeParms3 );

zOPER_EXPORT zSHORT OPERATION
GetGeneralPath( zVIEW vViewToSubTask0,
                zLONG lFlags1,
                zPCHAR pchszFileTyoe2,
                zPCHAR pchszTargetPath3 );

zOPER_EXPORT zSHORT OPERATION
DBQualEntityByString( zVIEW vvQualView0,
                      zPCHAR pchszEntityName1,
                      zPCHAR pchszAttributeName2,
                      zPCHAR pchszOper3,
                      zPCHAR pchszValue4,
                      zLONG lExists5 );

zOPER_EXPORT zSHORT OPERATION
GetCurrentApplicationName( zPCHAR pchReturnedString0,
                           zLONG lMaximumLength1,
                           zVIEW vViewToWindow2 );

zOPER_EXPORT zLONG OPERATION
ReadLine5000( zVIEW vViewToWindow0,
              zPCHAR pchLineBuffer1,
              zLONG llFileHandle2 );

zOPER_EXPORT zSHORT OPERATION
GetDataTypeForAttribute( zPCHAR pchDataType0,
                         zVIEW vObjectView1,
                         zPCHAR pchEntityName2,
                         zPCHAR pchAttributeName3 );

zOPER_EXPORT zSHORT OPERATION
AddSpacesToString( zPCHAR pchWorkString0 );

zOPER_EXPORT zSHORT OPERATION
FindStringInAttribute( zPCHAR pchSearchString0,
                       zVIEW vObjectView1,
                       zPCHAR pchEntityName2,
                       zPCHAR pchAttributeName3 );

zOPER_EXPORT zSHORT OPERATION
ConvertExternalValueOfAttribute( zPCHAR pchSearchValue0,
                                 zPCHAR pchInputSearchValue1,
                                 zVIEW vQueryView2,
                                 zPCHAR pchQueryEntityName3,
                                 zPCHAR pchQueryAttributeName4 );

zOPER_EXPORT zSHORT OPERATION
GetHTMLPath( zVIEW vViewToSubtask0,
             zLONG lnFlag1,
             zPCHAR pchTarget2 );

zOPER_EXPORT zSHORT OPERATION
GetRegistryCLSID( zPCHAR pchReturnData0,
                  zPCHAR pchszClassName1 );

zOPER_EXPORT zSHORT OPERATION
GetImagingPath( zVIEW vViewToSubtask0,
                zLONG lnFlag1,
                zPCHAR pchTarget2 );

zOPER_EXPORT zSHORT OPERATION
AGetRegistryValue( zPCHAR pchszResult0,
                   zPCHAR pchszKey1 );

zOPER_EXPORT zLONG OPERATION
CallObjectOperation( zPVIEW vViewToObject0,
                     zVIEW vvSubtask1,
                     zPCHAR pchszObjectName2,
                     zPCHAR pchszOperationName3 );

zOPER_EXPORT zLONG OPERATION
GetWindowsUserName( zPCHAR pchUserName0,
                    zLONG lMaxLengthOfName1 );

zOPER_EXPORT zSHORT OPERATION
RemoveLeadingBlanksFromAttrib( zVIEW vView0,
                               zPCHAR pchEntityName1,
                               zPCHAR pchAttributeName2 );

zOPER_EXPORT zLONG OPERATION
GetButtonHeaderName( zVIEW vViewToWindow0,
                     zPCHAR pchButtonHeaderName1 );

zOPER_EXPORT zSHORT OPERATION
AddMonthsToDate( zVIEW vTargetView0,
                 zPCHAR pchTargetEntityName1,
                 zPCHAR pchTargetAttributeName2,
                 zLONG lNumberOfMonths3 );

zOPER_EXPORT zLONG OPERATION
SetDecimalPrecisionRounded( zPDECIMAL mDecimalValue0,
                            zLONG lNumberOfDecimals1 );

zOPER_EXPORT zSHORT OPERATION
zTrim( zPCHAR pchStringInOut0 );

zOPER_EXPORT zSHORT OPERATION
PersonName_FirstMiddleLast( zVIEW vvAnyObject0,
                            zPVOID oszInternalEntityStruct1,
                            zPVOID oszInternalAttribStruct2,
                            zSHORT nnGetOrSetFlag3 );

zOPER_EXPORT zSHORT OPERATION
PersonName_LastFirstMiddle( zVIEW vvAnyObject0,
                            zPVOID oszInternalEntityStruct1,
                            zPVOID oszInternalAttribStruct2,
                            zSHORT nnGetOrSetFlag3 );

zOPER_EXPORT zSHORT OPERATION
GetAttribNameFromStructure( zPVOID oInternalAttribStructur0,
                            zPCHAR pchAttribName1 );

zOPER_EXPORT zSHORT OPERATION
dAdressLabelFull( zVIEW vvAnyObject0,
                  zPVOID oszInternalEntityStruct1,
                  zPVOID oszInternalAttribStruct2,
                  zSHORT nnGetOrSetFlag3 );

zOPER_EXPORT zSHORT OPERATION
dAdressLabel( zVIEW vvAnyObject0,
              zPVOID oszInternalEntityStruct1,
              zPVOID oszInternalAttribStruct2,
              zSHORT nnGetOrSetFlag3 );

zOPER_EXPORT zSHORT OPERATION
GetEntityNameFromStructure( zPVOID oInternalEntityStructur0,
                            zPCHAR pchEntityName1 );

zOPER_EXPORT zSHORT OPERATION
AddressFormatToMultiLine( zPCHAR pchMultiLineAddress0,
                          zPCHAR pchLine11,
                          zPCHAR pchLine22,
                          zPCHAR pchLine33,
                          zPCHAR pchCity4,
                          zPCHAR pchState5,
                          zPCHAR pchPostalCode6 );

zOPER_EXPORT zSHORT OPERATION
GetViewFromBlobAttribute( zPVIEW vRetrievedView0,
                          zVIEW vOI_View1,
                          zPCHAR pchOI_EntityName2,
                          zPCHAR pchOI_AttributeName3 );

zOPER_EXPORT zSHORT OPERATION
SetBlobAttributeFromView( zVIEW vOI_View0,
                          zPCHAR pchOI_EntityName1,
                          zPCHAR pchOI_AttributeName2,
                          zVIEW vViewToSet3 );

zOPER_EXPORT zSHORT OPERATION
SeparateName( zPCHAR pchFullName0,
              zPCHAR pchFirstName1,
              zPCHAR pchLastName2 );

zOPER_EXPORT zSHORT OPERATION
ReadLineIntoGlobalBuffer( zVIEW vViewToWindow0,
                          zLONG lhFile1 );

zOPER_EXPORT zSHORT OPERATION
SetAttributeFromTabField( zVIEW vCustomerView0,
                          zPCHAR pchEntityName1,
                          zPCHAR pchAttributeName2,
                          zLONG lFieldPosition3 );

zOPER_EXPORT zSHORT OPERATION
AddDaysToDate( zVIEW vTargetView0,
               zPCHAR pchTargetEntityName1,
               zPCHAR pchTargetAttributeName2,
               zLONG lNumberOfDays3 );

zOPER_EXPORT zSHORT OPERATION
ActivateWorkObjectFromFile( zPVIEW vWorkView0,
                            zPCHAR pchszFileName1,
                            zPCHAR pchszLOD_Name2,
                            zVIEW vViewToWindow3 );

zOPER_EXPORT zSHORT OPERATION
CompareAttributeByShortString( zVIEW vView0,
                               zPCHAR pchEntityName1,
                               zPCHAR pchAttributeName2,
                               zPCHAR pchszCompareString3 );

zOPER_EXPORT zSHORT OPERATION
AddWorkingDaysToDate( zVIEW vTargetView0,
                      zPCHAR pchTargetEntityName1,
                      zPCHAR pchTargetAttributeName2,
                      zLONG lNumberOfWorkingDays3 );

zOPER_EXPORT zSHORT OPERATION
GetDateAttributeDifferenceInDays( zPLONG lReturnedDays0,
                                  zVIEW vvSourceView1,
                                  zPCHAR pchSourceEntityName2,
                                  zPCHAR pchSourceAttributeName3,
                                  zVIEW vTargetView4,
                                  zPCHAR pchTargetEntityName5,
                                  zPCHAR pchTargetAttributeName6 );

zOPER_EXPORT zSHORT OPERATION
CharToCode( zPCHAR pchszStr0 );

zOPER_EXPORT zVOID OPERATION
CodeToChar( zPCHAR pchszStr0,
            zSHORT nsCode1 );

zOPER_EXPORT zDECIMAL OPERATION
StrToDecimal( zPCHAR pchszStr0 );

zOPER_EXPORT zDECIMAL OPERATION
DecimalSumOf( zVIEW vvView0,
              zPCHAR pchszEntityName1,
              zPCHAR pchszAttributeName2,
              zPCHAR pchszParentEntityName3 );

zOPER_EXPORT zLONG OPERATION
StrToInt( zPCHAR pchszStr0 );

zOPER_EXPORT zSHORT OPERATION
GetEnvVariable( zPCHAR pchszReturnWert0,
                zPCHAR pchszVariableName1,
                zSHORT nnMaxReturnLen2 );

zOPER_EXPORT zSHORT OPERATION
SetAttrFromStrByContext( zVIEW vView0,
                         zPCHAR eEntity1,
                         zPCHAR aAttribute2,
                         zPCHAR pchValue3,
                         zPCHAR pchContext4 );

zOPER_EXPORT zSHORT OPERATION
SetAttrFromIntByContext( zVIEW vView0,
                         zPCHAR eEntity1,
                         zPCHAR aAttribute2,
                         zLONG lValue3,
                         zPCHAR pchContext4 );

zOPER_EXPORT zSHORT OPERATION
AddToAttrFromIntByContext( zVIEW vView0,
                           zPCHAR eEntity1,
                           zPCHAR aAttribute2,
                           zLONG lValue3,
                           zPCHAR pchContext4 );

zOPER_EXPORT zSHORT OPERATION
GetStrFromAttrByContext( zPCHAR pchValue0,
                         zLONG lValueLen1,
                         zVIEW vView2,
                         zPCHAR eEntity3,
                         zPCHAR aAttribute4,
                         zPCHAR pchContext5 );

zOPER_EXPORT zSHORT OPERATION
GetIntFromAttrByContext( zPLONG lValue0,
                         zVIEW vView1,
                         zPCHAR eEntity2,
                         zPCHAR aAttribute3,
                         zPCHAR pchContext4 );

zOPER_EXPORT zSHORT OPERATION
SetCursorLatestEntity( zVIEW vView0,
                       zPCHAR pchEntityName1,
                       zPCHAR pchAttributeName2 );

zOPER_EXPORT zSHORT OPERATION
SetAttributeFromCurrentDateTime( zVIEW vView0,
                                 zPCHAR eEntityName1,
                                 zPCHAR aAttributeName2 );

//end
//start mTranReq 2017.03.21 15:35:41
zOPER_EXPORT zSHORT OPERATION
omTranReq_EmailTranscriptRequest( zVIEW vViewToInstance0,
                                  zVIEW vViewToWindow1 );

//end
//start mSATrnAp 2017.06.07 12:22:10
zOPER_EXPORT zSHORT OPERATION
omSATrnAp_SetReceiptNumber( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

//end
//start mGLTrans 2017.03.21 15:34:45
zOPER_EXPORT zSHORT OPERATION
omGLTrans_FindTransForDeposit( zPVIEW vViewToInstance0,
                               zVIEW vViewToWindow1,
                               zPCHAR pchszDate2,
                               zPCHAR pchszDate23,
                               zPCHAR pchszJournal4,
                               zPCHAR pchszResultName5 );

zOPER_EXPORT zSHORT OPERATION
omGLTrans_SummerizeGLTrans( zVIEW vmGLTransLST0,
                            zVIEW vViewToWindow1,
                            zPCHAR pchszDate2 );

zOPER_EXPORT zSHORT OPERATION
omGLTrans_SummerizeGLTransOld( zVIEW vmGLTransLST0,
                               zVIEW vViewToWindow1,
                               zPCHAR pchszDate2 );

zOPER_EXPORT zSHORT OPERATION
omGLTrans_BookGLTrans( zVIEW vmGLTransLST0,
                       zPCHAR pchszDate1 );

zOPER_EXPORT zSHORT OPERATION
omGLTrans_FindTransForSummary( zPVIEW vViewToInstance0,
                               zVIEW vViewToWindow1,
                               zPCHAR pchszDate2,
                               zPCHAR pchszJournal3,
                               zPCHAR pchszResultName4 );

//end
//start mCheckWO 2017.03.21 15:34:05
zOPER_EXPORT zSHORT OPERATION
omCheckWO_CompleteChecks( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omCheckWO_CompleteSAChecks( zVIEW vmCheckWO0 );

zOPER_EXPORT zSHORT OPERATION
omCheckWO_BuildCashDisbursements( zVIEW vViewToInstance0,
                                  zVIEW vViewToWindow1,
                                  zPCHAR pchszTranType2 );

//end
//start mFinAcct 2017.03.21 15:34:37
zOPER_EXPORT zSHORT OPERATION
omFinAcct_ActivateFinAcctList( zPVIEW vViewToInstance0,
                               zVIEW vzAnyView1,
                               zLONG lbForceReload2 );

//end
//start mGLCEnt 2017.07.13 13:33:15
zOPER_EXPORT zSHORT OPERATION
omGLCEnt_SetWorkValues( zVIEW vViewToInstance0 );

//end
//start mGLFund 2017.03.21 15:34:42
zOPER_EXPORT zSHORT OPERATION
omGLFund_CreateFund( zPVIEW vViewToInstance0,
                     zVIEW vzAnyView1,
                     zPCHAR pchCode2,
                     zPCHAR pchDescription3,
                     zPCHAR pchFundType4 );

zOPER_EXPORT zSHORT OPERATION
omGLFund_ActivateFund( zPVIEW vViewToInstance0,
                       zVIEW vzAnyView1,
                       zPCHAR pchCode2 );

//end
//start mGLChrtM 2017.03.21 15:34:40
zOPER_EXPORT zSHORT OPERATION
omGLChrtM_ObjConstraints( zVIEW vViewtoInstance0,
                          zSHORT nEvent1,
                          zSHORT nState2 );

//end
<<<<<<< HEAD
//start qStuEnr 2017.08.29 11:23:12
zOPER_EXPORT zSHORT OPERATION
oqStuEnr_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
oqStuEnr_SetStudentQueryTermWVs( zVIEW vqStuEnr0 );

zOPER_EXPORT zSHORT OPERATION
oqStuEnr_LoadJReportLibrary( zPVIEW vViewToInstance0,
                             zVIEW vViewToReport1 );

//end
//start mSAAge 2017.04.21 10:04:54
zOPER_EXPORT zSHORT OPERATION
omSAAge_ObjectCalcOperation( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omSAAge_CalcByAge( zVIEW vmSAAge0 );

zOPER_EXPORT zSHORT OPERATION
omSAAge_CalcByAgeAlt( zVIEW vViewToInstance0 );

//end
//start mSecTmpl 2017.03.21 15:35:26
zOPER_EXPORT zSHORT OPERATION
omSecTmpl_CreateNewTemplate( zPVIEW vvSecTmpl0,
                             zVIEW vzAnyView1 );

zOPER_EXPORT zSHORT OPERATION
omSecTmpl_CreateSetFromTemplate( zVIEW vViewToInstance0,
                                 zVIEW vvUGroups1 );

zOPER_EXPORT zSHORT OPERATION
omSecTmpl_CreateSubSections( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omSecTmpl_ObjectConstraints( zVIEW vViewtoInstance0,
                             zSHORT nEvent1,
                             zSHORT nState2 );

//end
//start rCLstTrm 2017.03.21 15:35:55
zOPER_EXPORT zSHORT OPERATION
orCLstTrm_LoadJReportObject( zPVIEW vViewToInstance0,
                             zVIEW vViewtofReport1 );

//end
//start rDormLst 2017.08.23 14:24:44
zOPER_EXPORT zSHORT OPERATION
orDormLst_LoadJReportObject( zPVIEW vViewToInstance0,
                             zVIEW vViewtofReport1 );

zOPER_EXPORT zSHORT OPERATION
orDormLst_LoadNonResidentReport( zPVIEW vViewToInstance0,
                                 zVIEW vnView1 );

//end
//start rProsLst 2017.08.22 11:23:21
zOPER_EXPORT zSHORT OPERATION
orProsLst_LoadJReportObject( zPVIEW vViewToInstance0,
                             zVIEW vViewToReport1 );

//end
//start rVisaLst 2017.03.21 15:35:57
zOPER_EXPORT zSHORT OPERATION
orVisaLst_LoadJReportObject( zPVIEW vViewToInstance0,
                             zVIEW vViewtofReport1 );

//end
//start wGLExprt 2017.07.19 10:07:56
zOPER_EXPORT zSHORT OPERATION
owGLExprt_AggregateTrans( zVIEW vViewToInstance0,
                          zVIEW vvView1 );

zOPER_EXPORT zSHORT OPERATION
owGLExprt_AggregateTransByCode( zVIEW vwGLExprt0,
                                zVIEW vmSACharges1 );

//end
//start ZGLOBAL2 2017.08.30 12:23:23
zOPER_EXPORT zLONG OPERATION
GetDOWNumber( zPCHAR pchszDateIn0 );

zOPER_EXPORT zVOID OPERATION
CLEAN_ForLogout( zVIEW vViewToWindow0 );

zOPER_EXPORT zVOID OPERATION
SetWebErrorMessage( zVIEW vViewToWindow0,
                    zPCHAR pchszMessage1 );

zOPER_EXPORT zSHORT OPERATION
DeleteCheckOI_ForUpdate( zVIEW vObjectView0,
                         zPCHAR pchObjectName1,
                         zLONG lObjectID2,
                         zPCHAR pchUserName3 );

zOPER_EXPORT zSHORT OPERATION
SetCheckOI_ForUpdate( zVIEW vObjectView0,
                      zPCHAR pchObjectName1,
                      zLONG lObjectID2,
                      zPCHAR pchUserName3 );

zOPER_EXPORT zLONG OPERATION
GetCurrentAgeFromDate( zVIEW vDateView0,
                       zPCHAR pchEntityName1,
                       zPCHAR pchAttributeName2 );

zOPER_EXPORT zSHORT OPERATION
MergeTemplateText( zVIEW vMergeDataView0,
                   zPCHAR pchTemplateText1,
                   zPCHAR pchReturnedText2 );

zOPER_EXPORT zSHORT OPERATION
SendSingleEmailForFile( zVIEW vViewToWindow0,
                        zPCHAR pchRecipientEmailAddres1,
                        zPCHAR pchEmailBodyFileName2,
                        zPCHAR pchEmailSubjectAreaText3 );

zOPER_EXPORT zSHORT OPERATION
SetCL_PositionalValue( zVIEW vAnyView0,
                       zPCHAR pchszOutputLine1,
                       zPCHAR pchszValueIn2,
                       zLONG lLength3,
                       zPCHAR pchDataType4 );

zOPER_EXPORT zSHORT OPERATION
SetAttributeByCL_PositionalValue( zVIEW vAnyView0,
                                  zPCHAR pchEntityName1,
                                  zPCHAR pchAttributeName2,
                                  zPCHAR pchszLine3,
                                  zLONG lStartPosition4,
                                  zLONG lLength5,
                                  zPCHAR pchszDataType6 );

zOPER_EXPORT zVOID OPERATION
ActivateDynamicDomain( zVIEW vViewToWindow0,
                       zPCHAR pchDomainName1 );

zOPER_EXPORT zSHORT OPERATION
SendEmailMessage( zVIEW vAnyView0,
                  zPCHAR pchRecipientEmailAddres1,
                  zPCHAR pchszSenderEmailAddress2,
                  zPCHAR pchszMessageBody3,
                  zPCHAR pchszSubjectText4 );

zOPER_EXPORT zSHORT OPERATION
SetAttributeByCommaDelimitValue( zVIEW vAnyView0,
                                 zPCHAR pchszEntityName1,
                                 zPCHAR pchszAttributeName2,
                                 zPCHAR pchszLine3,
                                 zLONG lValueCommaPos4 );

zOPER_EXPORT zLONG OPERATION
GetTimeDifferenceInMinutes( zVIEW vStartTimeView0,
                            zPCHAR pchStartTimeEntityName1,
                            zPCHAR pchStartTimeAttributeNa2,
                            zVIEW vEndTimeView3,
                            zPCHAR pchEndTimeEntityName4,
                            zPCHAR pchEndTimeAttributeName5 );

zOPER_EXPORT zSHORT OPERATION
GenerateTransactionEntryWDesc( zVIEW vAnyView0,
                               zPCHAR pchDescription1 );

zOPER_EXPORT zVOID OPERATION
GetPersonFullNameLFM( zPCHAR pchReturnedFullName0,
                      zVIEW vvOI1,
                      zPCHAR pchszEntityName2 );

zOPER_EXPORT zSHORT OPERATION
GenAndSetStudentEmailAddress( zVIEW vStudentView0,
                              zPCHAR pchStudentEntityName1,
                              zPCHAR pchPersonEntityName2 );

zOPER_EXPORT zSHORT OPERATION
RetrieveCommaDeliminatedValue( zPCHAR pchReturnedValue0,
                               zPCHAR pchszLine1,
                               zLONG lParameterNumber2 );

zOPER_EXPORT zSHORT OPERATION
SetDateFromLegacyDate( zVIEW vTargetView0,
                       zPCHAR pchTargetEntity1,
                       zPCHAR pchTargetAttribute2,
                       zVIEW vSourceView3,
                       zPCHAR pchSourceEntity4,
                       zPCHAR pchSourceAttribute5 );

zOPER_EXPORT zSHORT OPERATION
GenerateTransactionEntry( zVIEW vOIView0 );

zOPER_EXPORT zSHORT OPERATION
InitializeDynamicDomain( zVIEW vDOMAINT0 );

zOPER_EXPORT zSHORT OPERATION
GetPersonFullName( zPCHAR pchReturnedFullName0,
                   zVIEW vViewObject21,
                   zPCHAR pchszEntityName2 );

zOPER_EXPORT zSHORT OPERATION
OperatorWebPrompt( zVIEW vViewToWindow0,
                   zPCHAR pchTitle1,
                   zPCHAR pchMessage2 );

zOPER_EXPORT zSHORT OPERATION
OperatorErrorResponse( zVIEW vViewToWindow0,
                       zPCHAR pchTitle1,
                       zPCHAR pchMessage2 );

zOPER_EXPORT zSHORT OPERATION
InitializeDynamicDomains( zVIEW vAnyView0 );

zOPER_EXPORT zSHORT OPERATION
GenerateSeasonalAddresses( zVIEW vResultSetView0,
                           zVIEW vwXferO1,
                           zPCHAR pchObjectViewName2 );

zOPER_EXPORT zLONG OPERATION
GetDaysInMonth( zPCHAR pchszDateIn0 );

//end
//start mGLTrnAp 2017.03.21 15:34:46
zOPER_EXPORT zSHORT OPERATION
omGLTrnAp_SetReceiptNumber( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

//end
//start mCohReg 2017.03.21 15:34:14
zOPER_EXPORT zSHORT OPERATION
omCohReg_CLEAR_Errors( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omCohReg_FORMAT_Errors( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
omCohReg_COPY_ErrorsFromStudenC( zVIEW vViewToInstance0,
                                 zVIEW vmStudenC1 );

//end
//start fAlumni 2017.03.21 15:33:20
zOPER_EXPORT zSHORT OPERATION
ofAlumni_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

//end
//start mAlumni 2017.03.21 15:34:00
zOPER_EXPORT zSHORT OPERATION
omAlumni_ObjectContrainsts( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

//end
//start ZGLOBAL3 2017.08.30 12:10:27
zOPER_EXPORT zSHORT OPERATION
DISPLAY_HTML_Graph( zVIEW vViewToWindow0 );

zOPER_EXPORT zVOID OPERATION
GenerateLine( zVIEW vAnyView0,
              zLONG llFileHandle1,
              zPCHAR pchOutputLine2 );

zOPER_EXPORT zSHORT OPERATION
SetImportStringAttribute( zVIEW vAnyView0,
                          zPCHAR pchszEntityName1,
                          zPCHAR pchszAttributeName2,
                          zPCHAR pchszInputString3,
                          zLONG lStartingPosition4,
                          zLONG lLength5 );

zOPER_EXPORT zSHORT OPERATION
VALIDATE_AdministrationSecurityG( zVIEW vViewToWindow0 );

zOPER_EXPORT zSHORT OPERATION
CloseSplitWindow_G( zVIEW vViewtoWindow0,
                    zPCHAR pchAreaName1,
                    zPCHAR pchFrameName2 );

zOPER_EXPORT zSHORT OPERATION
RefreshCloseSplitWindow_G( zVIEW vViewtoWindow0,
                           zPCHAR pchAreaName1,
                           zPCHAR pchFrameName2,
                           zPCHAR pchDetailName3 );

zOPER_EXPORT zSHORT OPERATION
zCloseWindow( zVIEW vvWindowToClose0 );

zOPER_EXPORT zSHORT OPERATION
DeleteGeneralTask_G( zVIEW vViewToWindow0,
                     zPCHAR pchTaskName1 );

//end
//start zGLOBALR 2017.08.30 11:49:32
zOPER_EXPORT zSHORT OPERATION
SAVE_PersonData_G( zVIEW vViewToWindow0 );

zOPER_EXPORT zSHORT OPERATION
PICK_PrePerson_G( zVIEW vViewToWindow0 );

zOPER_EXPORT zSHORT OPERATION
DELETE_Person_G( zVIEW vViewToWindow0 );

zOPER_EXPORT zSHORT OPERATION
UPDATE_PersonDetail_G( zVIEW vViewToWindow0 );

zOPER_EXPORT zSHORT OPERATION
SAVE_Person_G( zVIEW vViewToWindow0 );

//end
//start qStuEnr2 2017.08.29 11:14:42
zOPER_EXPORT zSHORT OPERATION
oqStuEnr2_ObjectConstraint( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
oqStuEnr2_SetStudentQueryTermWVs( zVIEW vqStuEnr0 );

zOPER_EXPORT zSHORT OPERATION
oqStuEnr2_LoadJReportLibrary( zPVIEW vViewToInstance0,
                              zVIEW vViewToReport1 );

//end
//start qGenPeop 2017.06.28 12:39:25
zOPER_EXPORT zSHORT OPERATION
oqGenPeop_ObjectConstraint( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

//end
//start qGenEnr 2017.07.11 11:52:10
zOPER_EXPORT zSHORT OPERATION
oqGenEnr_ObjectConstraints( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
oqGenEnr_ValidateGrade( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
oqGenEnr_EnrollmentConstraint( zVIEW vViewtoInstance0,
                               zPCHAR pchNameOfEntity1,
                               zSHORT nEvent2,
                               zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
oqGenEnr_ValidateClassData( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
oqGenEnr_RoomSessionConstraint( zVIEW vViewtoInstance0,
                                zPCHAR pchNameOfEntity1,
                                zSHORT nEvent2,
                                zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
oqGenEnr_BuildSurveyAnalysis( zVIEW vViewToInstance0,
                              zPVIEW vlClsSurv1,
                              zPCHAR pchType2 );

//end
//start mPersMrg 2017.07.25 10:41:34
zOPER_EXPORT zSHORT OPERATION
omPersMrg_ObjectConstraint( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omPersMrg_MergeSourceToTarget( zVIEW vViewToInstance0,
                               zVIEW vSourcePersonView1 );

zOPER_EXPORT zSHORT OPERATION
omPersMrg_MergeSourceToTargetC( zVIEW vmPersMrgT0,
                                zVIEW vmPersMrgS1 );

zOPER_EXPORT zSHORT OPERATION
omPersMrg_RecreateSourcePerson( zPVIEW vViewToInstance0,
                                zVIEW vmPersMrgSrcOrig1,
                                zVIEW vmPersMrgTgtNew2,
                                zVIEW vmPersMrgTgtOrig3 );

zOPER_EXPORT zSHORT OPERATION
omPersMrg_CorrectMergeEntries( zVIEW vmPersMrgSrc0,
                               zVIEW vmPersMrgTgt1,
                               zVIEW vmPersMrgCur2 );

//end
//start mEmpMrg 2017.07.06 16:24:00
zOPER_EXPORT zSHORT OPERATION
omEmpMrg_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omEmpMrg_MergeSourceToTarget( zVIEW vmEmpMrgT0,
                              zVIEW vmEmpMrgS1 );

//end
//start mFacMrg 2017.07.10 11:55:41
zOPER_EXPORT zSHORT OPERATION
omFacMrg_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
omFacMrg_MergeSourceToTarget( zVIEW vViewToInstance0,
                              zVIEW vViewToInstance21 );

//end
//start qGenCls 2017.07.12 14:37:38
zOPER_EXPORT zSHORT OPERATION
oqGenCls_ObjectConstraints( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
oqGenCls_ValidateGrade( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
oqGenCls_EnrollmentConstraint( zVIEW vViewtoInstance0,
                               zPCHAR pchNameOfEntity1,
                               zSHORT nEvent2,
                               zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
oqGenCls_ValidateClassData( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
oqGenCls_RoomSessionConstraint( zVIEW vViewtoInstance0,
                                zPCHAR pchNameOfEntity1,
                                zSHORT nEvent2,
                                zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
oqGenCls_BuildSurveyAnalysis( zVIEW vViewToInstance0,
                              zPVIEW vlClsSurv1,
                              zPCHAR pchType2 );

//end
//start qGenPro 2017.08.03 13:39:07
zOPER_EXPORT zSHORT OPERATION
oqGenPro_ObjectConstraint( zVIEW vViewtoInstance0,
                           zSHORT nEvent1,
                           zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
oqGenPro_WkRequirementDateSet( zVIEW vViewtoInstance0,
                               zPCHAR pchNameOfEntity1,
                               zSHORT nEvent2,
                               zSHORT nState3 );

zOPER_EXPORT zSHORT OPERATION
oqGenPro_AssignTerritoryValues( zVIEW vViewToInstance0,
                                zVIEW vmAdmDiv1 );

zOPER_EXPORT zSHORT OPERATION
oqGenPro_GenerateStudentRecord( zVIEW vmProspct0 );

zOPER_EXPORT zSHORT OPERATION
oqGenPro_SetAutoProspectData( zVIEW vViewToInstance0,
                              zVIEW vmPerson1 );

zOPER_EXPORT zSHORT OPERATION
oqGenPro_ValidateProspectData( zVIEW vViewToInstance0,
                               zVIEW vmPerson1 );

//end
//start fGenPro 2017.08.03 12:01:39
zOPER_EXPORT zSHORT OPERATION
ofGenPro_GenerateRequirements( zVIEW vViewToInstance0 );

zOPER_EXPORT zSHORT OPERATION
ofGenPro_ObjectConstraints( zVIEW vViewtoInstance0,
                            zSHORT nEvent1,
                            zSHORT nState2 );

zOPER_EXPORT zSHORT OPERATION
ofGenPro_GenerateFARequirements( zVIEW vqProspct0 );

zOPER_EXPORT zSHORT OPERATION
ofGenPro_GenerateAwarded( zVIEW vViewToInstance0 );

//end
//start mStuMrg 2017.08.16 15:42:18
zOPER_EXPORT zSHORT OPERATION
omStuMrg_MergeSourceToTarget( zVIEW vViewToInstance0,
                              zVIEW vSourcePersonView1 );

//end
//start rEmployLst 2017.08.23 12:29:04
zOPER_EXPORT zSHORT OPERATION
orEmployLst_LoadJReportObject( zPVIEW vViewToInstance0,
                               zVIEW vViewtofReport1 );

//end
