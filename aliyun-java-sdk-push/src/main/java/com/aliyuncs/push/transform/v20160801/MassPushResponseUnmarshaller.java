/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.push.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.push.model.v20160801.MassPushResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MassPushResponseUnmarshaller {

	public static MassPushResponse unmarshall(MassPushResponse massPushResponse, UnmarshallerContext _ctx) {
		
		massPushResponse.setRequestId(_ctx.stringValue("MassPushResponse.RequestId"));

		List<String> messageIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("MassPushResponse.MessageIds.Length"); i++) {
			messageIds.add(_ctx.stringValue("MassPushResponse.MessageIds["+ i +"]"));
		}
		massPushResponse.setMessageIds(messageIds);
	 
	 	return massPushResponse;
	}
}