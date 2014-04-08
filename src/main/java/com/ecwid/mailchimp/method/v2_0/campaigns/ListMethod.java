/*
 * Copyright 2013 Ecwid, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ecwid.mailchimp.method.v2_0.campaigns;

import java.util.Date;

import com.ecwid.mailchimp.MailChimpAPIVersion;
import com.ecwid.mailchimp.MailChimpMethod;
import com.ecwid.mailchimp.MailChimpObject;

/**
 * Retrieve all of the campaigns defined for your user account
 */
@MailChimpMethod.Method(name = "campaigns/list", version = MailChimpAPIVersion.v2_0)
public class ListMethod extends MailChimpMethod<ListMethodResult> {

    @Field
    public Filters filters;

    @Field
    public Integer start;

    @Field
    public Integer limit;

    @Field
    public String sort_field;

    @Field
    public String sort_dir;

    /**
     * Filters to apply to this query - all are optional:
     */
    public static class Filters extends MailChimpObject {

        @Field
        public String campaign_id;

        @Field
        public String parent_id;

        @Field
        public String list_id;

        @Field
        public Integer folder_id;
        
        @Field
        public Integer template_id;
        
        @Field
        public String status;
        
        @Field
        public String type;
        
        @Field
        public String from_name;
        
        @Field
        public String from_email;
        
        @Field
        public String title;
        
        @Field
        public String subject;
        
        @Field
        public Date sendtime_start; //24 hour format in GMT, eg "2013-12-30 20:30:00"

        @Field
        public Date sendtime_end; //24 hour format in GMT, eg "2013-12-30 20:30:00"
        
        @Field
        public Boolean uses_segment;

        @Field
        public Boolean exact;

    }
}
